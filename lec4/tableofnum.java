/*
 * INTERVIEW QUESTIONS - Multiplication Table using For Loop:
 *
 * Q1: What are the three parts of a for loop?
 * A: Initialization, condition, increment/decrement (update)
 *
 * Q2: When is the initialization executed?
 * A: Only once, before the loop starts
 *
 * Q3: What is the order of execution in for loop?
 * A: init -> condition -> body -> update -> condition -> body...
 *
 * Q4: Can we declare multiple variables in for loop?
 * A: Yes, but they must be same type: for(int i=0, j=0; ...)
 *
 * Q5: What is loop variable scope?
 * A: Variable declared in for loop is only accessible within the loop
 */
import java.util.*;
public class tableofnum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        // Q: What is the time complexity? A: O(10) = O(1) - constant time
        // Q: Why i<11 and not i<=10? A: Both are equivalent, matter of preference
        for(int i=1;i<11;i++){
            System.out.println(i*n);  // Prints n*1, n*2, ..., n*10

        }

    }

}
