/*
 * INTERVIEW QUESTIONS - Java Stack Class:
 *
 * Q1: Does Java have built-in Stack class?
 * A: Yes, java.util.Stack<E> - extends Vector
 *
 * Q2: Is Java's Stack class thread-safe?
 * A: Yes, because it extends Vector (synchronized)
 *
 * Q3: What is the recommended alternative to Stack?
 * A: ArrayDeque - faster, not synchronized, implements Deque
 *
 * Q4: Main methods of Java Stack class?
 * A: push(), pop(), peek(), empty(), search()
 *
 * Q5: What does search() return?
 * A: 1-based position from top; -1 if not found
 *
 * Q6: Why is Stack<Integer> not Stack<int>?
 * A: Generics require objects; primitives auto-boxed to wrapper classes
 */
package Java.lec30;
import java.util.*;

public class stackclass3 {
    public static void main(String[] args) {
        // Q: What is <Integer>? A: Generic type parameter
        Stack<Integer>s=new Stack<>();

        // Q: What methods are available? A: push, pop, peek, empty, search
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        // Q: Order of output? A: 4, 3, 2, 1 (LIFO order)
        while (!s.isEmpty()) {
            System.out.println(s.peek());  // View top
            s.pop();                        // Remove top
        }
    }

}
