/*
 * INTERVIEW QUESTIONS - Reversing String using StringBuilder:
 *
 * Q1: How to reverse a string in Java?
 * A: Use StringBuilder.reverse(), two-pointer swap, or loop with charAt
 *
 * Q2: What is two-pointer technique?
 * A: Using two indices moving from both ends toward center
 *
 * Q3: Why iterate only length/2 times?
 * A: Each swap handles two characters; after n/2 swaps, string is reversed
 *
 * Q4: Time complexity of this approach?
 * A: O(n) - n/2 swaps, which is O(n)
 *
 * Q5: Space complexity?
 * A: O(1) extra space - in-place modification
 *
 * Q6: Built-in method for reverse?
 * A: StringBuilder has reverse() method: sb.reverse()
 */
import java.util.*;
public class stringb2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("toji");

        // Q: Why length/2? A: Each iteration swaps 2 chars, so half iterations needed
        for(int i=0;i<sb.length()/2;i++){
            int front=i;              // Start from beginning
            int back=sb.length()-1-i; // Start from end

            // Q: What is this pattern called? A: Two-pointer swap technique
            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);

            // Swap front and back characters
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);  // Prints "ijot" (reversed "toji")
    }
}
