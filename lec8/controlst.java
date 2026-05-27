/*
 * INTERVIEW QUESTIONS - Boolean Expressions and Control Flow:
 *
 * Q1: What is a boolean expression?
 * A: An expression that evaluates to true or false
 *
 * Q2: What are comparison operators?
 * A: ==, !=, <, >, <=, >= - return boolean values
 *
 * Q3: Can we store comparison result in a variable?
 * A: Yes, in boolean type variable
 *
 * Q4: What is the default value of boolean?
 * A: false (for instance variables)
 *
 * Q5: What happens if condition in if is not boolean?
 * A: Compilation error - Java requires boolean in conditions
 */
import java.util.*;
public class controlst {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter x vlaue= ");
         int x=sc.nextInt();

        // Q: What type is result? A: boolean (true or false)
        boolean result = (x > 5);  // Comparison returns boolean

        // Q: Can we use result directly in if? A: Yes, it's a boolean
        if (result) {
            System.out.println("x is greater than 5");
        }
    }

}
