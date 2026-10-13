import java.util.*;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 15;
        
        System.out.println("Number: " + n);
        System.out.println("Binary: " + Integer.toBinaryString(n));
        System.out.println("Set bits: " + countSetBits(n));
        System.out.println("Total set bits from 1 to " + n + ": " + countSetBitsTillN(n));
    }
    
    // Count set bits in a number (Brian Kernighan's Algorithm)
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
    
    // Count total set bits from 1 to N
    public static int countSetBitsTillN(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += countSetBits(i);
        }
        return count;
    }
}
