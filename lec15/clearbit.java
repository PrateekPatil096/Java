/*
 * INTERVIEW QUESTIONS - Clear Bit (Bit Manipulation):
 *
 * Q1: What does "clear a bit" mean?
 * A: Change a bit from 1 to 0 at a specific position
 *
 * Q2: How to clear a bit at position i?
 * A: Use AND with NOT of mask: number & ~(1 << i)
 *
 * Q3: What does ~ (NOT) operator do?
 * A: Flips all bits (0 becomes 1, 1 becomes 0)
 *
 * Q4: Why use NOT with AND to clear bit?
 * A: NOT creates mask with 0 at position i; AND with 0 clears that bit
 *
 * Q5: What is ~(100) in binary?
 * A: ...11111011 (all 1s except position 2)
 *
 * Q6: Does clear bit affect other bits?
 * A: No, AND with 1 preserves original bits; only position with 0 changes
 */
import java.util.*;
public class clearbit {
    public static void main(String[] args) {
        int n=5;    // Binary: 101
        int pos=2;  // Clear bit at position 2

        // Q: What mask do we need? A: All 1s except 0 at position 2
        int bitMask=1<<pos;         // 100
        int notBitMask=~(bitMask);  // ...11111011

        // Q: What does AND with notBitMask do? A: Clears bit at position 2
        // 101 & ...11111011 = 001 = 1
        int newNumber=notBitMask&n;
        System.out.println(newNumber);  // Output: 1

    }
}
