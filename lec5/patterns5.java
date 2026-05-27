/*
 * INTERVIEW QUESTIONS - Right-Aligned Triangle:
 *
 * Q1: How to right-align a pattern?
 * A: Print spaces before the characters to push them right
 *
 * Q2: Formula for spaces in row i?
 * A: (n - i) spaces, where n is total rows
 *
 * Q3: Why two inner loops?
 * A: First for spaces (alignment), second for stars (content)
 *
 * Q4: What is the total characters per row?
 * A: Spaces + Stars = (n-i) + i = n (constant for all rows)
 *
 * Q5: Time complexity?
 * A: O(n^2) - each row processes n characters total
 */
import java.util.*;
public class patterns5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            // Q: How many spaces in row i? A: (n-i) spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");  // Leading spaces for alignment
            }
            // Q: How many stars in row i? A: i stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
