/*
 * INTERVIEW QUESTIONS - Linked List with Reverse:
 *
 * Q1: What is a Linked List?
 * A: Linear data structure where elements are linked using pointers; not contiguous memory
 *
 * Q2: What is a Node in Linked List?
 * A: Object containing data and reference to next node
 *
 * Q3: Advantages of Linked List over Array?
 * A: Dynamic size, efficient insertion/deletion at any position
 *
 * Q4: Disadvantages of Linked List?
 * A: No random access (O(n) to access element), extra memory for pointers
 *
 * Q5: Time complexity to reverse a linked list?
 * A: O(n) - single pass through all nodes
 *
 * Q6: What is the iterative approach to reverse?
 * A: Use three pointers (prev, curr, next) and reverse links one by one
 *
 * Q7: Space complexity of iterative reverse?
 * A: O(1) - only using three pointers regardless of list size
 */
public class ll {

    Node head;  // Q: What is head? A: Reference to first node of list

    // Q: What is a static inner class? A: Nested class that doesn't need outer instance
    static class Node {
        int data;
        Node next;  // Q: What is this? A: Reference to next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Q: What is the algorithm for iterative reverse?
    // A: For each node, reverse its next pointer to point to previous node
    public void reverse() {
        Node prev = null;      // Q: Why null initially? A: First node will become last (points to null)
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;   // Q: Why save next? A: We're about to overwrite curr.next
            curr.next = prev;   // Q: What is this? A: Reverse the link
            prev = curr;        // Move prev forward
            curr = next;        // Move curr forward
        }

        head = prev;   // Q: Why prev? A: prev is now at the last node (new head)
    }


    public void printlist() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        // Q: How to traverse linked list? A: Start at head, follow next pointers
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ll list = new ll();

        // Q: How to manually create linked list?
        list.head = new ll.Node(1);
        list.head.next = new ll.Node(2);
        list.head.next.next = new ll.Node(3);

        System.out.println("Original:");
        list.printlist();   // 1 --> 2 --> 3 --> null

        list.reverse();
        System.out.println("Reversed:");
        list.printlist();   // 3 --> 2 --> 1 --> null
    }
}
