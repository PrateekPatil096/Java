/*
 * INTERVIEW QUESTIONS - Binary Tree:
 *
 * Q1: What is a Binary Tree?
 * A: Tree where each node has at most two children (left and right)
 *
 * Q2: What are tree traversals?
 * A: Preorder (Root-L-R), Inorder (L-Root-R), Postorder (L-R-Root), Level Order (BFS)
 *
 * Q3: What is Preorder traversal?
 * A: Visit root first, then left subtree, then right subtree
 *
 * Q4: What is Inorder traversal?
 * A: Visit left subtree, then root, then right subtree
 *
 * Q5: What is Postorder traversal?
 * A: Visit left subtree, then right subtree, then root
 *
 * Q6: What is Level Order (BFS) traversal?
 * A: Visit nodes level by level using queue
 *
 * Q7: What is the height of a tree?
 * A: Maximum number of edges from root to any leaf
 *
 * Q8: What is the diameter of a tree?
 * A: Longest path between any two nodes
 */
import java.util.*;


public class binarytree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        // Q: How does this build tree from array?
        // A: Uses preorder sequence with -1 as null marker
        public static Node buildTree(int nodes[]) {
            idx++;

            if (nodes[idx] == -1) {
                return null;  // -1 represents null node
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);   // Build left subtree
            newNode.right = buildTree(nodes);  // Build right subtree

            return newNode;
        }
    }

    // Q: Order of Preorder? A: Root, Left, Right
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");  // Visit root first
        preorder(root.left);               // Then left
        preorder(root.right);              // Then right
    }

    // Q: Order of Inorder? A: Left, Root, Right
    // Q: What does inorder of BST give? A: Sorted sequence
    public static void inOrder(Node root){
        if(root ==null){
            return;
        }
        inOrder(root.left);                // Left first
        System.out.print(root.data+" ");   // Then root
        inOrder(root.right);               // Then right
    }

    // Q: Order of Postorder? A: Left, Right, Root
    public static void postOrder(Node root ){
        if(root == null){
            return ;
        }
        postOrder(root.left);              // Left first
        postOrder(root.right);             // Then right
        System.out.print(root.data+" ");   // Root last
    }

    // Q: What data structure for level order? A: Queue
   public static void levelOrder(Node root) {
    if (root == null) {
        return;
    }

    Queue<Node> q = new LinkedList<>();

    q.add(root);
    q.add(null);  // Q: What is null marker? A: Level separator

    while (!q.isEmpty()) {
        Node currNode = q.remove();

        if (currNode == null) {
            System.out.println();  // End of level

            if (q.isEmpty()) {
                break;
            } else {
                q.add(null);  // Add marker for next level
            }
        } else {
            System.out.print(currNode.data + " ");

            if (currNode.left != null) {
                q.add(currNode.left);
            }

            if (currNode.right != null) {
                q.add(currNode.right);
            }
        }
    }
}

// Q: How to count nodes recursively?
// A: 1 (current) + count of left subtree + count of right subtree
public static int countofnodes(Node root){
    if(root==null){
        return 0;
    }
    int leftNodes=countofnodes(root.left);
    int rightNodes=countofnodes(root.right);

    return leftNodes+rightNodes+1;  // +1 for current node
}

// Q: How to find sum of all nodes?
public static int sumofnodes(Node root){
    if(root==null){
        return 0;
    }
    int leftSum=sumofnodes(root.left);
    int rightSum=sumofnodes(root.right);

    return leftSum+rightSum+root.data;
}

// Q: What is height of tree?
// A: Maximum depth from root to leaf
public static int height(Node root){
    if(root== null){
        return 0;
    }
    int leftHeight=height(root.left);
    int rightHeight=height(root.right);

    int myHeight=Math.max(leftHeight,rightHeight)+1;
    return myHeight;
}

// Q: What is diameter? A: Longest path between any two nodes
// Q: Time complexity of this approach? A: O(n^2)
public static int diameter(Node root){
    if(root==null){
        return 0;
    }
    int diam1=diameter(root.left);   // Diameter in left subtree
    int diam2=diameter(root.right);  // Diameter in right subtree
    int diam3=height(root.left)+height(root.right)+1;  // Path through root

    return Math.max(diam3,Math.max(diam1,diam2));
}

// Q: How to optimize diameter? A: Calculate height and diameter together
static class TreeInfo{
    int ht;
    int diam;
    TreeInfo(int ht,int diam){
        this.ht=ht;
        this.diam=diam;
    }
}

// Q: Time complexity of optimized diameter? A: O(n)
public static TreeInfo diameter2(Node root){
    if(root ==null){
       return new TreeInfo(0, 0);
    }
    TreeInfo left= diameter2(root.left);
    TreeInfo right=diameter2(root.right);

    int myHeight=Math.max(left.ht,right.ht)+1;
    int diam1=left.diam;
    int diam2=right.diam;
    int diam3=left.ht+right.ht+1;

    int mydiam=Math.max(Math.max(diam1,diam2),diam3);

    TreeInfo myInfo=new TreeInfo(myHeight,mydiam);
    return myInfo;
}


    public static void main(String args[]) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println(diameter2(root).diam);
    }
}
