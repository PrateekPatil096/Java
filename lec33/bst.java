/*
 * INTERVIEW QUESTIONS - Binary Search Tree (BST):
 *
 * Q1: What is a BST?
 * A: Binary tree where left child < root < right child for all nodes
 *
 * Q2: What is BST property?
 * A: All nodes in left subtree < root < all nodes in right subtree
 *
 * Q3: Time complexity of search in BST?
 * A: O(h) where h is height; O(log n) average, O(n) worst case (skewed)
 *
 * Q4: What does inorder traversal of BST give?
 * A: Sorted sequence in ascending order
 *
 * Q5: What is inorder successor?
 * A: Smallest node in right subtree; leftmost node starting from right child
 *
 * Q6: How to delete node with two children?
 * A: Replace with inorder successor, then delete successor
 *
 * Q7: Time complexity of BST operations?
 * A: Insert, Delete, Search - all O(h), h = log n for balanced BST
 */
import java.util.*;

public class bst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }

    // Q: How does BST insertion work?
    // A: Compare with root, go left if smaller, right if larger
    public static Node insert(Node root ,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);  // Insert in left subtree
        }
        else{
            root.right=insert(root.right,val);  // Insert in right subtree
        }
        return root;
    }

    // Q: What does inorder of BST produce? A: Sorted output
    public static void inorder(Node root){
        if(root ==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);

    }

    // Q: How to search in BST? A: Compare and go left/right
    public static boolean Search(Node root,int key){
        if(root == null){
            return false;  // Key not found
        }
        if(root.data>key){
            return Search(root.left, key);   // Search left
        }
        else if(root.data==key){
            return true;  // Found!
        }
        else{
            return Search(root.right, key);  // Search right
        }
    }

    // Q: Three cases for BST deletion?
    // A: 1) Leaf node 2) One child 3) Two children
    public static Node delete(Node root,int val){
        if(root.data>val){
            root.left=delete(root.left,val);
        }
        else if(root.data<val){
            root.right=delete(root.right,val);
        }
        else{
            // Case 1: Leaf node - just delete
            if(root.left==null && root.right==null){
                return null;
            }
            // Case 2: One child - return the child
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            // Case 3: Two children - replace with inorder successor
            Node IS=inorderSuccesser(root.right);
            root.data=IS.data;  // Copy successor's data
            root.right=delete(root.right,IS.data);  // Delete successor
        }
        return root;

    }

    // Q: What is inorder successor? A: Leftmost node in right subtree
    public static Node inorderSuccesser(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    // Q: How to print nodes in a range [x, y]?
    public static void printinrange(Node root,int x,int y){
        if(root==null){
            return;
        }
        if(root.data>=x&& root.data<=y){
            printinrange(root.left, x, y);
            System.out.print(root.data+" ");
            printinrange(root.right, x, y);
        }
        else if(root.data>=y){
            printinrange(root.left, x, y);  // Only go left
        }
        else{
            printinrange(root.right, x, y);  // Only go right
        }
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " -> ");
        }
        System.out.println("null");
    }

    // Q: How to print all root-to-leaf paths?
    // A: Use backtracking - add node to path, recurse, remove node
    public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.data);  // Add current to path

        // Q: How to identify leaf? A: Both children are null
        if (root.left == null && root.right == null) {
            printPath(path);  // Print complete path
        } else {
            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);
        }

        // Q: What is this? A: BACKTRACK - remove current node
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }

        inorder(root);  // Sorted output
        System.out.println();

       printRoot2Leaf(root,new ArrayList<>());

    }

}
