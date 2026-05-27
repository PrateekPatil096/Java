/*
 * INTERVIEW QUESTIONS - Number Pyramid:
 *
 * Q1: How to print same number multiple times in a row?
 * A: Use outer loop variable (i) in print statement instead of inner (j)
 *
 * Q2: Pattern of this pyramid?
 * A: Row i has i occurrences of number i (1, 22, 333, 4444...)
 *
 * Q3: How to center align a pattern?
 * A: Print (n-i) leading spaces before the content
 *
 * Q4: Why add space after each number?
 * A: For better readability and visual spacing
 *
 * Q5: Time complexity?
 * A: O(n^2) - triangular number of operations
 */
import java.util.*;

public class advpatterns12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            // Q: Leading spaces for pyramid alignment
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // Q: What is printed? A: Row number 'i' repeated 'i' times
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");  // Note: prints i, not j
            }
            System.out.println();
        }

    }

}
