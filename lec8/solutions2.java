/*
 * INTERVIEW QUESTIONS - Finding Greater of Two Numbers:
 *
 * Q1: How to compare two numbers in Java?
 * A: Using relational operators: >, <, >=, <=, ==, !=
 *
 * Q2: What is the ternary operator alternative?
 * A: int max = (a > b) ? a : b; - shorter but less readable
 *
 * Q3: Can we use Math.max() instead?
 * A: Yes, Math.max(a, b) returns larger of two numbers
 *
 * Q4: What does this method return?
 * A: Always returns 1 (could be improved to return the greater number)
 *
 * Q5: What is the difference between printing and returning?
 * A: Printing outputs to console; returning sends value back to caller
 */
import java.util.*;

public class solutions2 {
    // Q: Could we return the greater value instead of 1?
    // A: Yes, return a or b directly based on condition
    public static int greater(int a, int b) {
        if (a > b) {
            System.out.println("a is greater thean b" + a);
        } else {
            System.out.println("b is greater than a " + b);

        }
        return 1;  // Q: Why return 1? A: Could be improved to return max value

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        greater(a, b);
    }
}
