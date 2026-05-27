/*
 * INTERVIEW QUESTIONS - Right Triangle Star Pattern:
 *
 * Q1: What is the relationship between row number and stars?
 * A: Row i has i stars (linear relationship)
 *
 * Q2: Time complexity of this pattern?
 * A: O(n^2) - total operations = 1+2+3+...+n = n(n+1)/2
 *
 * Q3: How does inner loop limit change with outer loop?
 * A: Inner loop runs from 1 to i (current row number)
 *
 * Q4: What pattern is this called?
 * A: Right-angled triangle or staircase pattern
 *
 * Q5: How to print inverted triangle?
 * A: Start outer loop from n and decrement, or change inner loop condition
 */
import java.util.*;

public class patterns3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        // Q: How many stars in row i? A: i stars
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){  // j goes up to i (current row)
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
