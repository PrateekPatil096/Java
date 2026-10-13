import java.util.*;

public class CheckBit {
    public static void main(String[] args) {
        int n = 5;  // Binary: 101
        int i = 2;
        
        System.out.println("Number: " + n + " (Binary: " + Integer.toBinaryString(n) + ")");
        System.out.println("Is bit " + i + " set? " + isSet(n, i));
        System.out.println("Set bit " + 1 + ": " + setBit(n, 1));
        System.out.println("Unset bit " + 2 + ": " + unsetBit(n, 2));
        System.out.println("Toggle bit " + 0 + ": " + toggleBit(n, 0));
    }
    
    // Check if ith bit is set
    public static boolean isSet(int n, int i) {
        return (n & (1 << i)) != 0;
    }
    
    // Set ith bit
    public static int setBit(int n, int i) {
        return n | (1 << i);
    }
    
    // Unset ith bit
    public static int unsetBit(int n, int i) {
        return n & ~(1 << i);
    }
    
    // Toggle ith bit
    public static int toggleBit(int n, int i) {
        return n ^ (1 << i);
    }
}
