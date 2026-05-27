/*
 * INTERVIEW QUESTIONS - Factorial using Recursion:
 *
 * Q1: What is the recursive formula for factorial?
 * A: n! = n * (n-1)!; Base case: 0! = 1! = 1
 *
 * Q2: Why are both 0! and 1! equal to 1?
 * A: By definition; 0! = 1 for mathematical consistency (empty product)
 *
 * Q3: Time complexity of recursive factorial?
 * A: O(n) - makes n recursive calls
 *
 * Q4: Space complexity?
 * A: O(n) - n stack frames
 *
 * Q5: Can factorial cause overflow?
 * A: Yes, 13! > Integer.MAX_VALUE; use long or BigInteger
 *
 * Q6: Is iterative or recursive factorial more efficient?
 * A: Iterative - O(1) space vs O(n) for recursive
 */
public class recursion1_3 {
    public static int calcfactorial(int n){
        // Q: Why check both 0 and 1? A: Both are base cases, return 1
        if(n==0||n==1){
            return 1;
        }
        // Q: What is fact_nm1? A: Factorial of (n-1)
        int fact_nm1=calcfactorial(n-1);  // Recursive call
        int fact_n=n*fact_nm1;  // n! = n * (n-1)!
        return fact_n;
    }

    public static void main(String[] args) {
        int n=5;
        int ans=calcfactorial(n);  // 5! = 5*4*3*2*1 = 120
        System.out.println(ans);
    }
}
