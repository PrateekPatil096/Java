/*
 * INTERVIEW QUESTIONS - Inverted Number Triangle:
 *
 * Q1: Pattern of numbers per row?
 * A: Row 1 has n numbers (1 to n), row 2 has n-1 numbers (1 to n-1), etc.
 *
 * Q2: What is n-i+1?
 * A: Calculates how many numbers to print in row i (decreasing pattern)
 *
 * Q3: How is this different from patterns4?
 * A: This prints numbers (1,2,3...) instead of stars
 *
 * Q4: What would (n-i+1) equal when i=1 and n=5?
 * A: 5-1+1 = 5, so first row prints 5 numbers
 *
 * Q5: Time complexity?
 * A: O(n^2) - inverted triangle pattern
 */
import java.util.*;
public class patterns7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            // Q: What is n-i+1 when i=n? A: 1, so last row has only 1 number
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);  // Prints 1,2,3... up to (n-i+1)
            }
            System.out.println();
        }
    }

}
