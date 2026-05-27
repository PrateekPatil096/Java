/*
 * INTERVIEW QUESTIONS - Stack using Linked List:
 *
 * Q1: What is a Stack?
 * A: LIFO (Last In First Out) data structure
 *
 * Q2: What are the main operations of Stack?
 * A: push (add to top), pop (remove from top), peek (view top)
 *
 * Q3: Why implement stack using linked list?
 * A: Dynamic size, no overflow (except memory limit)
 *
 * Q4: Time complexity of push, pop, peek?
 * A: O(1) for all operations
 *
 * Q5: What is stack overflow?
 * A: Pushing to a full stack (in array implementation)
 *
 * Q6: What is stack underflow?
 * A: Popping from an empty stack
 *
 * Q7: Real-world applications of Stack?
 * A: Function calls, undo operation, expression evaluation, backtracking
 */
package Java.lec30;
public class stackclass {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static Node head;  // Q: What is head? A: Top of the stack

        // Q: When is stack empty? A: When head is null
        public static boolean isEmpty() {
            return head == null;
        }

        // Q: Where do we add new element? A: At the beginning (top)
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;  // New node points to current top
            head = newNode;       // New node becomes top
        }

        // Q: What does pop return? A: Data of removed top element
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack underflow");
                return -1;
            }
            int top = head.data;
            head = head.next;   // Move head to next node
            return top;
        }

        // Q: Difference between pop and peek?
        // A: peek only views top element, pop removes it
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);  // Stack: 1
        s.push(2);  // Stack: 2 -> 1
        s.push(3);  // Stack: 3 -> 2 -> 1
        s.push(4);  // Stack: 4 -> 3 -> 2 -> 1

        // Q: Order of output? A: 4, 3, 2, 1 (LIFO)
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
