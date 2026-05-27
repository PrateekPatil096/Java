/*
 * INTERVIEW QUESTIONS - Fibonacci Series using Recursion:
 *
 * Q1: What is Fibonacci sequence?
 * A: Each number is sum of two preceding: 0, 1, 1, 2, 3, 5, 8, 13...
 *
 * Q2: What is the recursive formula for Fibonacci?
 * A: F(n) = F(n-1) + F(n-2); Base: F(0)=0, F(1)=1
 *
 * Q3: Time complexity of naive recursive Fibonacci?
 * A: O(2^n) - exponential due to repeated calculations
 *
 * Q4: How to optimize Fibonacci?
 * A: Use memoization (DP) or iterative approach for O(n)
 *
 * Q5: What is this approach doing differently?
 * A: Using iteration-like recursion with a,b parameters - O(n) time
 *
 * Q6: Golden ratio connection to Fibonacci?
 * A: F(n)/F(n-1) approaches golden ratio (1.618...) as n increases
 */
public class recursion1_4 {
    public static void printFib(int a,int b,int n){
        // Q: Base case - stop after printing n numbers
        if(n==0){
            return ;
        }
        int c=a+b;  // Next Fibonacci number
        System.out.println(c);
        // Q: Why b,c instead of a,b? A: Sliding window - previous two numbers
        printFib(b, c, n-1);
    }

    public static void main(String[] args) {
        int a=0,b=1;  // First two Fibonacci numbers
        System.out.println(a);  // Print F(0)
        System.out.println(b);  // Print F(1)
        int n=7;
        printFib(a,b,n-2);  // Print remaining n-2 numbers
    }

}
