/*
 * INTERVIEW QUESTIONS - Set Bit (Bit Manipulation):
 *
 * Q1: What does "set a bit" mean?
 * A: Change a bit from 0 to 1 at a specific position
 *
 * Q2: How to set a bit at position i?
 * A: Use OR operation: number | (1 << i)
 *
 * Q3: What does | (OR) operator do?
 * A: Returns 1 if either bit is 1
 *
 * Q4: Why use OR to set bit?
 * A: OR with 1 always gives 1; OR with 0 preserves original bit
 *
 * Q5: What is 5 | 2 in binary?
 * A: 101 | 010 = 111 = 7
 *
 * Q6: Does set bit change the bit if already 1?
 * A: No, 1 OR 1 = 1 (unchanged)
 */
import java.util.*;
public class setbit {
    public static void main(String[] args) {
        int n=5;    // Binary: 0101
        int pos=1;  // Set bit at position 1

        // Q: What is 1<<1? A: 10 in binary = 2
        int bitMask=1<<pos;  // bitMask = 2 (binary: 0010)

        // Q: What does OR do here? A: Sets bit at position 1 to 1
        // 0101 | 0010 = 0111 = 7
        int newNumber=bitMask|n;
        System.out.println(newNumber);  // Output: 7
    }
}
