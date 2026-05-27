/*
 * INTERVIEW QUESTIONS - Recursive Reverse of Linked List:
 *
 * Q1: What is recursive approach to reverse linked list?
 * A: Recurse to end, then reverse links during backtracking
 *
 * Q2: Time complexity of recursive reverse?
 * A: O(n) - visit each node once
 *
 * Q3: Space complexity of recursive reverse?
 * A: O(n) - recursion stack holds n frames
 *
 * Q4: Which is better - iterative or recursive reverse?
 * A: Iterative for space efficiency O(1); recursive for readability
 *
 * Q5: What does addFirst() do?
 * A: Inserts new node at the beginning of list - O(1)
 *
 * Q6: Key insight for recursive reverse?
 * A: node.next.next = node makes the next node point back to current
 */
class reversell {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Q: Time complexity of addFirst? A: O(1) - constant time
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;  // New node points to current head
        head = newNode;       // New node becomes head
    }

    public void printlist() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // Wrapper function
    public void reverseRecursive() {
        head = reverseRecursive(head);
    }

    // Q: What is the recursive logic?
    // A: Go to end, then reverse links while coming back
    private Node reverseRecursive(Node node) {

        // Q: Base case? A: Empty list or single node (already reversed)
        if (node == null || node.next == null) {
            return node;
        }

        // Q: What does this return? A: The last node (new head after reverse)
        Node newHead = reverseRecursive(node.next);

        // Q: What is this magic line doing?
        // A: Makes next node point back to current node (reverse the link)
        node.next.next = node;
        node.next = null;  // Current node becomes last, so points to null

        return newHead;  // Return the new head (last node of original)
    }

    public static void main(String[] args) {
        reversell list = new reversell();

        list.addFirst(3);  // List: 3
        list.addFirst(2);  // List: 2 -> 3
        list.addFirst(1);  // List: 1 -> 2 -> 3

        System.out.println("Original:");
        list.printlist();

        list.reverseRecursive();

        System.out.println("Reversed:");
        list.printlist();  // 3 -> 2 -> 1
    }
}
