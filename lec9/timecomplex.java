/*
 * INTERVIEW QUESTIONS - Time Complexity O(n^2):
 *
 * Q1: What is O(n^2) complexity?
 * A: Quadratic time - execution time grows as square of input size
 *
 * Q2: When does O(n^2) occur?
 * A: Nested loops where both depend on same variable n
 *
 * Q3: Is O(n^2) efficient for large n?
 * A: No, it becomes slow quickly. For n=1000, operations = 1,000,000
 *
 * Q4: Examples of O(n^2) algorithms?
 * A: Bubble sort, Selection sort, checking all pairs
 *
 * Q5: How to optimize O(n^2) algorithms?
 * A: Often can be improved using sorting, hashing, or divide & conquer
 */
import java.util.*;

public class timecomplex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        // Q: Time complexity? A: O(n^2) - quadratic
        // Q: Total operations? A: n * n = n^2
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println("hello");
            }

        }
    }
}
