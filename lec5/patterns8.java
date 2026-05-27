/*
 * INTERVIEW QUESTIONS - Floyd's Triangle:
 *
 * Q1: What is Floyd's Triangle?
 * A: A right triangle of consecutive natural numbers starting from 1
 *
 * Q2: How is it different from other number patterns?
 * A: Numbers continue across rows, not reset for each row
 *
 * Q3: What is a state variable?
 * A: Variable that maintains state across iterations (like 'num' here)
 *
 * Q4: What number starts row n?
 * A: The number after the last number of row (n-1) = n(n-1)/2 + 1
 *
 * Q5: Time complexity?
 * A: O(n^2) - total numbers = 1+2+...+n = n(n+1)/2
 */
import java.util.*;

public class patterns8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;  // Q: Why declare outside loop? A: To maintain count across rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;  // Q: When is num incremented? A: After each number is printed

            }
            System.out.println();
        }
    }
}
