/*
 * INTERVIEW QUESTIONS - Function with Return Value:
 *
 * Q1: What is a return type?
 * A: Data type of value that method returns (int, String, etc.)
 *
 * Q2: Can a method have multiple return statements?
 * A: Yes, but only one executes (usually in if-else)
 *
 * Q3: What are parameters/arguments?
 * A: Values passed to method; parameters are in definition, arguments are in call
 *
 * Q4: What is pass-by-value in Java?
 * A: Copy of value is passed, original variable unchanged
 *
 * Q5: Can we return multiple values from a method?
 * A: Not directly; use array, object, or collection
 */
import java.util.*;
public class sum {
    // Q: What does 'int' before method name mean? A: Method returns an integer
    public static int calculateSum(int a, int b){
        int sum=a+b;
        return sum;  // Q: Can we write return a+b? A: Yes, expressions allowed
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        // Q: What happens to returned value? A: Stored in variable 'sum'
        int sum=calculateSum(a, b);
        System.out.println("sum of two numbers is ="+ sum);
    }
}
