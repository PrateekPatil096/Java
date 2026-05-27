/*
 * INTERVIEW QUESTIONS - Function for Multiplication:
 *
 * Q1: What is function reusability?
 * A: Same function can be called multiple times with different arguments
 *
 * Q2: What are formal and actual parameters?
 * A: Formal: in method definition (a,b); Actual: in method call (values passed)
 *
 * Q3: Does parameter name matter in method call?
 * A: No, position and type matter; names are for readability
 *
 * Q4: What is string concatenation with +?
 * A: Joining strings; non-strings are converted to strings automatically
 *
 * Q5: Can we have method with same name but different parameters?
 * A: Yes, it's called method overloading
 */
import java.util.*;

public class multi {
    // Q: What is the return type? A: int (returns integer product)
    public static int calculateProudct(int a, int b) {
        return a * b;  // Q: Can we do calculation directly in return? A: Yes
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Q: What is string + int? A: Concatenation, int converted to string
        System.out.println("product of two numbersis="+calculateProudct(a, b));
    }
}
