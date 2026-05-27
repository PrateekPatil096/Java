/*
 * INTERVIEW QUESTIONS - Palindromic Number Pyramid:
 *
 * Q1: What is a palindrome?
 * A: Something that reads same forwards and backwards (e.g., 121, 12321)
 *
 * Q2: How to create palindromic rows?
 * A: Print numbers decreasing then increasing (or vice versa)
 *
 * Q3: Why two loops for numbers?
 * A: First prints decreasing (i to 1), second prints increasing (2 to i)
 *
 * Q4: What does row 4 look like?
 * A: "4321234" - palindromic sequence
 *
 * Q5: Time complexity?
 * A: O(n^2) - each row has up to 2*n-1 characters
 */
import java.util.*;

public class advpatterns13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Leading spaces for pyramid shape
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Q: First half - decreasing from i to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Q: Second half - increasing from 2 to i (skip 1 to avoid duplicate)
            for (int j = 2; j <= i; j++) {
                System.out.print(j);

            }
            System.out.println();
        }
    }
}
