/*
 * INTERVIEW QUESTIONS - Diamond Pattern:
 *
 * Q1: How to create a diamond shape?
 * A: Combine pyramid (expanding) with inverted pyramid (contracting)
 *
 * Q2: Formula for stars in row i of pyramid?
 * A: 2*i-1 stars (1, 3, 5, 7... for rows 1, 2, 3, 4...)
 *
 * Q3: Why 2*i-1 for stars?
 * A: Creates odd number sequence needed for centered pyramid
 *
 * Q4: Total rows in diamond of size n?
 * A: 2*n rows (n for upper half, n for lower half)
 *
 * Q5: Time complexity?
 * A: O(n^2) - 2n rows, each with up to 2n-1 characters
 */
import java.util.*;
public class advpatterns14 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // UPPER HALF - expanding pyramid
        for (int i = 1; i <= n; i++) {
            // Q: Leading spaces formula? A: (n-i) spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Q: Why 2*i-1 stars? A: Creates 1,3,5,7... pattern for pyramid
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // LOWER HALF - contracting pyramid (mirror of upper)
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
