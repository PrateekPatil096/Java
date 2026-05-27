/*
 * INTERVIEW QUESTIONS - Push at Bottom of Stack:
 *
 * Q1: How to push element at bottom of stack?
 * A: Recursively pop all elements, push new element, push back all elements
 *
 * Q2: Time complexity of pushAtBottom?
 * A: O(n) - need to pop and push all n elements
 *
 * Q3: Space complexity?
 * A: O(n) - recursion stack holds n elements
 *
 * Q4: What is the algorithm?
 * A: 1) Pop all elements recursively
 *    2) Push new element at empty stack (bottom)
 *    3) Push back all popped elements
 *
 * Q5: Why is this useful?
 * A: Building block for reversing a stack
 *
 * Q6: Can we do this iteratively?
 * A: Yes, using auxiliary stack - still O(n) time and space
 */
import java.util.*;

public class stackclass4 {
    // Q: What is the recursive approach?
    // A: Pop all elements, insert at bottom, push elements back
    public static void pushAtBottom(int data,Stack<Integer>s){
        // Q: Base case? A: Empty stack - this is the bottom!
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        // Q: What does this do? A: Temporarily remove top element
        int top=s.pop();

        // Q: What happens here? A: Recurse until stack is empty
        pushAtBottom(data, s);  // Insert data at bottom

        // Q: Why push top after recursive call?
        // A: Restores the original element on top of inserted element
        s.push(top);
    }

    public static void main(String[] args) {
        Stack <Integer>s=new Stack<>();

        s.push(1);  // Stack: 1
        s.push(2);  // Stack: 2, 1
        s.push(3);  // Stack: 3, 2, 1

        pushAtBottom(4, s);  // Stack: 3, 2, 1, 4 (4 at bottom)

        // Q: Output order? A: 3, 2, 1, 4
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
