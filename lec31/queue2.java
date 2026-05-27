/*
 * INTERVIEW QUESTIONS - Queue using Two Stacks:
 *
 * Q1: Can we implement Queue using Stacks?
 * A: Yes, using two stacks we can achieve FIFO behavior
 *
 * Q2: What is the approach?
 * A: For add: move all from s1 to s2, push new element, move back
 *
 * Q3: Time complexity of add()?
 * A: O(n) - need to transfer all elements
 *
 * Q4: Time complexity of remove()?
 * A: O(1) - just pop from s1
 *
 * Q5: Is there a better approach?
 * A: Yes, lazy transfer - O(1) amortized for both operations
 *
 * Q6: Why is this asked in interviews?
 * A: Tests understanding of stack/queue properties and problem-solving
 */
import java.util.*;

public class queue2 {
    static class queue{
        // Q: Why two stacks? A: To reverse LIFO to FIFO
        static Stack<Integer>s1=new Stack<>();  // Main stack
        static Stack<Integer>s2=new Stack<>();  // Helper stack

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        // Q: What is the algorithm for add?
        // A: Transfer all to s2, push new, transfer back - ensures FIFO order
        public static void add (int data){
            // Step 1: Move all elements from s1 to s2
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            // Step 2: Push new element to s1 (will be at bottom)
            s1.push(data);
            // Step 3: Move all back from s2 to s1
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        // Q: Why is remove O(1)? A: Front is already at top of s1
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;

            }
            return s1.pop();  // Front of queue is top of s1
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;

            }
            return s1.peek();

        }

    }

     public static void main(String[] args) {
        queue q=new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // Q: Output? A: 1, 2, 3, 4, 5 (FIFO despite using stacks)
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

}
