/*
 * INTERVIEW QUESTIONS - Rectangle Pattern (Nested Loops):
 *
 * Q1: What is a nested loop?
 * A: A loop inside another loop; inner loop completes all iterations for each outer loop iteration
 *
 * Q2: What is the time complexity of nested loops?
 * A: O(n*m) where n and m are iterations of outer and inner loops
 *
 * Q3: Why use nested loops for patterns?
 * A: Outer loop controls rows, inner loop controls columns
 *
 * Q4: What does System.out.println() without argument do?
 * A: Prints an empty line, moves cursor to next line
 *
 * Q5: How many times does inner loop execute in total?
 * A: n * m times (product of outer and inner iterations)
 */
import java.util.*;

public class patterns1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  // rows
        int m=sc.nextInt();  // columns

        // Q: Which loop controls rows? A: Outer loop (i)
        // Q: Which loop controls columns? A: Inner loop (j)
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");  // Q: Why print() not println()? A: Stay on same line
            }
            System.out.println();  // Q: What is this for? A: Move to next row
        }
    }

}
