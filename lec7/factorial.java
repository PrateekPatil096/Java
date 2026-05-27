/*
 * INTERVIEW QUESTIONS - Factorial using Iteration:
 *
 * Q1: What is factorial of n?
 * A: Product of all positive integers from 1 to n; n! = 1*2*3*...*n
 *
 * Q2: What is 0! (factorial of zero)?
 * A: 1 (by definition)
 *
 * Q3: Time complexity of iterative factorial?
 * A: O(n) - single loop from n to 1
 *
 * Q4: Space complexity?
 * A: O(1) - only using fixed variables
 *
 * Q5: What is the maximum factorial that fits in int?
 * A: 12! = 479001600 (13! overflows int)
 *
 * Q6: Why initialize f to 1 not 0?
 * A: 1 is identity for multiplication; 0 would make product always 0
 */
import java.util.*;
public class factorial {
    public static void printFactorial(int n){
        int f=1;  // Q: Why 1? A: Multiplicative identity
        // Q: Why loop from n to 1? A: Same result as 1 to n, personal preference
        for(int i=n;i>=1;i--){
            f=f*i;  // Accumulate product
        }
        System.out.println(f);
        return;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printFactorial(n);
    }
}
