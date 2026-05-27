/*
 * INTERVIEW QUESTIONS - Inverted Right Triangle:
 *
 * Q1: How to reverse a pattern?
 * A: Change loop direction (start from n, go to 1) or reverse condition
 *
 * Q2: What is the pattern of stars per row?
 * A: Row 1 has n stars, row 2 has n-1, ..., row n has 1 star
 *
 * Q3: Difference between i-- and --i in loop?
 * A: Both decrement, but --i decrements before use, i-- after
 *
 * Q4: What is the loop invariant here?
 * A: Stars in row i equals i (when counting from top with i starting at n)
 *
 * Q5: Time complexity?
 * A: O(n^2) - same as regular triangle, just reversed
 */
import java.util.*;

public class patterns4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Q: Why start from n? A: To print n stars first, then decrease
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
