/*
 * INTERVIEW QUESTIONS - Recursion with Sum (Accumulator):
 *
 * Q1: What is an accumulator in recursion?
 * A: Parameter that carries computed result through recursive calls
 *
 * Q2: What happens when we print after recursive call?
 * A: Statements execute in reverse order during unwinding (backtracking)
 *
 * Q3: What is call stack unwinding?
 * A: When recursion returns, pending statements execute in LIFO order
 *
 * Q4: Sum of first n natural numbers formula?
 * A: n*(n+1)/2 - can verify recursive result with this
 *
 * Q5: Why does this print numbers in reverse at the end?
 * A: print(i) executes during backtracking, from inner to outer calls
 */
public class recursion1_2 {
    public static void printSum(int i,int n,int sum){
        // Q: Base case - when i reaches n
        if(i==n){
            sum=sum+i;  // Add last number
            System.out.println(sum);  // Print total sum
            return;
        }
        sum=sum+i;  // Accumulate sum
        printSum(i+1, n, sum);  // Recursive call
        // Q: When does this execute? A: During backtracking (stack unwinding)
        System.out.println(i);
    }

    public static void main(String[] args) {
        printSum(1,5,0);  // Calculates sum of 1 to 5 = 15
    }

}
