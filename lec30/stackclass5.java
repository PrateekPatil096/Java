/*
 * INTERVIEW QUESTIONS - Reverse Stack using Recursion:
 *
 * Q1: How to reverse a stack using recursion only?
 * A: Pop each element, reverse remaining, push element at bottom
 *
 * Q2: Time complexity of reverse?
 * A: O(n^2) - for each element, pushAtBottom takes O(n)
 *
 * Q3: Space complexity?
 * A: O(n) - recursion depth
 *
 * Q4: Can we reverse without extra space?
 * A: Using recursion as shown, or with auxiliary stack O(n) space
 *
 * Q5: What is the algorithm?
 * A: 1) Pop top element
 *    2) Recursively reverse remaining stack
 *    3) Push popped element at bottom
 *
 * Q6: Why use pushAtBottom?
 * A: After reversing rest, we need to put current element at very bottom
 */
import java.util.*;

public class stackclass5 {
    // Helper function - insert element at bottom
    public static void pushAtBottom(int data,Stack<Integer>s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    // Q: What is the logic?
    // A: Pop element, reverse rest, push element at bottom of reversed stack
    public static void reverse(Stack<Integer>s){
        // Q: Base case? A: Empty or single element stack is already reversed
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();   // Remove top element
        reverse(s);        // Reverse remaining stack
        pushAtBottom(top, s);  // Put removed element at bottom
    }

    public static void main(String[] args) {
        Stack <Integer>s=new Stack<>();

        s.push(1);  // Stack: 1 (bottom)
        s.push(2);  // Stack: 2, 1
        s.push(3);  // Stack: 3 (top), 2, 1

        reverse(s);  // Stack: 1 (top), 2, 3 (bottom)

        // Q: Output after reverse? A: 1, 2, 3 (original bottom is now top)
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
