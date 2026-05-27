/*
 * INTERVIEW QUESTIONS - Power Function (x^n) - Linear Recursion:
 *
 * Q1: What is the recursive formula for power?
 * A: x^n = x * x^(n-1); Base case: x^0 = 1
 *
 * Q2: Time complexity of this approach?
 * A: O(n) - makes n recursive calls
 *
 * Q3: What are the two base cases?
 * A: n=0 returns 1 (any number^0 = 1), x=0 returns 0 (0^anything = 0)
 *
 * Q4: Can we optimize this?
 * A: Yes, using binary exponentiation: O(log n)
 *
 * Q5: What about negative exponents?
 * A: x^(-n) = 1/x^n; need to return double type
 *
 * Q6: Space complexity?
 * A: O(n) - n stack frames
 */
public class recursion1_5 {
    public static int calcPower(int x,int n){
        // Q: What is x^0? A: 1 (any number to power 0)
        if(n==0){
            return 1;
        }
        // Q: What is 0^n (for n>0)? A: 0
        if(x==0){
            return 0;
        }
        // Q: What is the recurrence relation? A: x^n = x * x^(n-1)
        int xPownm1=calcPower(x, n-1);  // x^(n-1)
        int xPown=x*xPownm1;  // x * x^(n-1) = x^n
        return xPown;
    }

    public static void main(String[] args) {
        int x=2,n=5;
        int ans=calcPower(x, n);  // 2^5 = 32
        System.out.println(ans);
    }

}
