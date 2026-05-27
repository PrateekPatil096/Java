/*
 * INTERVIEW QUESTIONS - Butterfly Pattern:
 *
 * Q1: How to create symmetric patterns?
 * A: Combine upper half and lower half (mirrored) patterns
 *
 * Q2: Formula for spaces between two halves?
 * A: 2*(n-i) for upper half, creates decreasing then increasing gap
 *
 * Q3: Why are there three inner loops per row?
 * A: Left stars + middle spaces + right stars
 *
 * Q4: How to mirror a pattern vertically?
 * A: Create same pattern with reversed loop (n to 1 instead of 1 to n)
 *
 * Q5: Time complexity?
 * A: O(n^2) - 2n rows, each with O(n) characters
 */
import java.util.*;
public class advpatterns10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        // UPPER HALF - stars expand, spaces contract
        for(int i=1;i<=n;i++){
            // Q: How many stars on left? A: i stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // Q: Formula for spaces? A: 2*(n-i), decreases as i increases
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            // Q: Are left and right stars equal? A: Yes, symmetric pattern
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        // LOWER HALF - mirror of upper half
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

}
