/*
 * INTERVIEW QUESTIONS - Update Bit (Set or Clear):
 *
 * Q1: What is update bit operation?
 * A: Either set (to 1) or clear (to 0) a bit based on a condition
 *
 * Q2: How to combine set and clear operations?
 * A: Check condition, then apply set bit (OR) or clear bit (AND with NOT)
 *
 * Q3: When to use update bit?
 * A: When bit value depends on some condition or flag
 *
 * Q4: Time complexity of bit operations?
 * A: O(1) - constant time operations
 *
 * Q5: What are common bit manipulation applications?
 * A: Flags, permissions, compression, cryptography, optimization
 *
 * Q6: How to toggle a bit (flip 0 to 1 or 1 to 0)?
 * A: Use XOR: number ^ (1 << position)
 */
import java.util.*;
public class updatebit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();  // 1 for set, 0 for clear
        int n=5;    // Binary: 101
        int pos=1;  // Position to update
        int bitMask=1<<pos;  // Mask for position 1

        // Q: What operation for oper=1? A: Set bit (OR)
        if(oper==1){
            // SET BIT: Use OR
            int newNumber=bitMask|n;  // 101 | 010 = 111 = 7
            System.out.println(newNumber);
        }
        // Q: What operation for oper=0? A: Clear bit (AND with NOT)
        else{
            // CLEAR BIT: Use AND with NOT
            int newBitMask=~(bitMask);  // Invert mask
            int newNumber=newBitMask&n;
            System.out.println(newNumber);

        }
    }

}
