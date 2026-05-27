/*
 * INTERVIEW QUESTIONS - Right-Shifted Rectangle:
 *
 * Q1: How to shift a pattern to the right?
 * A: Print leading spaces before the actual pattern
 *
 * Q2: Pattern of spaces per row?
 * A: Row i has (n-i) spaces, decreasing as we go down
 *
 * Q3: What shape does this create?
 * A: A parallelogram or slanted rectangle
 *
 * Q4: Difference from right-aligned triangle?
 * A: This has same number of stars per row, just shifted
 *
 * Q5: Time complexity?
 * A: O(n^2) - n rows, each with n+spaces characters
 */
import java.util.*;
public class advpatterns11 {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    for(int i=1;i<=n;i++){
        // Q: How many leading spaces in row i? A: (n-i) spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        // Q: How many stars per row? A: Always n (constant)
        for(int j=1;j<=n;j++){
            System.out.print("*");

        }
        System.out.println();
    }
}
}
