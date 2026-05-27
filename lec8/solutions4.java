/*
 * INTERVIEW QUESTIONS - Power Function (x^n):
 *
 * Q1: What is x^n (x to the power n)?
 * A: x multiplied by itself n times
 *
 * Q2: Time complexity of this approach?
 * A: O(n) - loop runs n times
 *
 * Q3: Can we optimize power calculation?
 * A: Yes, using binary exponentiation: O(log n)
 *
 * Q4: What is Math.pow() in Java?
 * A: Built-in method: Math.pow(x, n) returns x^n as double
 *
 * Q5: What if n is negative?
 * A: x^(-n) = 1/(x^n), need to handle separately
 *
 * Q6: Why initialize result to 1?
 * A: 1 is multiplicative identity; any number times 1 is itself
 */
import java.util.*;
public class solutions4 {
    public static int power(int x,int n){
        int result=1;  // Q: Why 1? A: x^0 = 1, identity for multiplication
        // Q: What happens when n=0? A: Loop doesn't execute, returns 1 (correct!)
        for(int i=1;i<=n;i++){
            result=result*x;  // Multiply x, n times
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x");
        int x=sc.nextInt();  // Base
        System.out.println("enter n");
        int n=sc.nextInt();  // Exponent
        int ans=power(x, n);
        System.out.println("result="+ans);
    }
}
