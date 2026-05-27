/*
 * INTERVIEW QUESTIONS - Number Triangle Pattern:
 *
 * Q1: How to print numbers instead of stars?
 * A: Replace "*" with the loop variable or expression
 *
 * Q2: What is printed in row i?
 * A: Numbers 1 to i, e.g., row 3 prints "1 2 3"
 *
 * Q3: Why add space after number?
 * A: For readability and proper alignment
 *
 * Q4: How to print row number repeated?
 * A: Print i instead of j in inner loop
 *
 * Q5: Time complexity?
 * A: O(n^2) - same as star triangle
 */
import java.util.*;
public class patterns6 {
public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();

    for(int i=1;i<=n;i++){
        // Q: What does j represent? A: Column number and the value to print
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");  // Prints 1, 2, 3... up to i

        }
        System.out.println();
    }
}
}
