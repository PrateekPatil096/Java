/*
 * INTERVIEW QUESTIONS - Java Queue Interface:
 *
 * Q1: Is Queue a class or interface in Java?
 * A: Queue is an interface; LinkedList/ArrayDeque implement it
 *
 * Q2: Why use LinkedList for Queue?
 * A: Efficient O(1) add at end and remove from front
 *
 * Q3: What are Queue methods?
 * A: add/offer (enqueue), remove/poll (dequeue), element/peek (view front)
 *
 * Q4: Difference between add() and offer()?
 * A: add() throws exception if full; offer() returns false
 *
 * Q5: Difference between remove() and poll()?
 * A: remove() throws exception if empty; poll() returns null
 *
 * Q6: What is Deque?
 * A: Double-ended queue - can add/remove from both ends
 */
import java.util.*;

public class queue1 {
     public static void main(String[] args) {
        // Q: Why LinkedList? A: Implements Queue interface with O(1) operations
        // Q: What is <Integer>? A: Generic type - queue stores Integer objects
        Queue<Integer> q=new LinkedList<>();

        // Q: Where does add() insert? A: At the end (rear) of queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // Q: Output order? A: 1, 2, 3, 4, 5 (FIFO - first added = first out)
        while(!q.isEmpty()){
            System.out.println(q.peek());   // View front
            q.remove();  // Remove front
        }
    }

}
