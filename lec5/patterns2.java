/*
 * INTERVIEW QUESTIONS - Hollow Rectangle Pattern:
 *
 * Q1: How to identify boundary elements in a matrix?
 * A: First row (i==1), last row (i==n), first col (j==1), last col (j==m)
 *
 * Q2: What is the logic for hollow patterns?
 * A: Print character on boundary, space otherwise
 *
 * Q3: What does || operator do?
 * A: Logical OR - returns true if any condition is true
 *
 * Q4: Time complexity of this pattern?
 * A: O(n*m) - we visit each cell once
 *
 * Q5: How would you make a solid rectangle into hollow?
 * A: Add condition to print space for non-boundary elements
 */
import java.util.*;
public class patterns2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                // Q: What are the four boundary conditions?
                // A: First row (i==1), last row (i==n), first col (j==1), last col (j==m)
                if(i==1||j==1||i==n||j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");  // Interior is hollow
                }

            }
            System.out.println();

        }
    }
}
