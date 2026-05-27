/*
 * INTERVIEW QUESTIONS - Get Bit (Bit Manipulation):
 *
 * Q1: What is bit manipulation?
 * A: Operations performed directly on binary representations of numbers
 *
 * Q2: What does << operator do?
 * A: Left shift - shifts bits left, effectively multiplying by 2^n
 *
 * Q3: What is a bitmask?
 * A: A number used to isolate, set, or clear specific bits
 *
 * Q4: What does & (AND) operator do?
 * A: Returns 1 only if both bits are 1
 *
 * Q5: How to check if bit at position i is set?
 * A: Create mask (1<<i), AND with number, check if result is non-zero
 *
 * Q6: Binary of 5?
 * A: 101 in binary (1*4 + 0*2 + 1*1 = 5)
 */
import java.util.*;

public class getbit {
    public static void main(String[] args) {
        int n=5;    // Binary: 101
        int pos=2;  // Check bit at position 2 (0-indexed from right)

        // Q: What does 1<<pos create? A: 100 in binary (bit at position 2)
        int bitMask=1<<pos;  // bitMask = 4 (binary: 100)

        // Q: What does bitMask & n do? A: Isolates bit at position 2
        // 100 & 101 = 100 (non-zero means bit is 1)
        if((bitMask&n)==0){
            System.out.println("bit was zero");
        }
        else{
            System.out.println("bit was one");  // This will print
        }
    }
}
