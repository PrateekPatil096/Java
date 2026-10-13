import java.util.*;

public class FibonacciDP {
    public static void main(String[] args) {
        int n = 10;
        
        System.out.println("Fibonacci(" + n + ") Memoization: " + fibMemo(n, new int[n + 1]));
        System.out.println("Fibonacci(" + n + ") Tabulation: " + fibTab(n));
        System.out.println("Fibonacci(" + n + ") Space Optimized: " + fibOptimized(n));
    }
    
    // Top-Down (Memoization)
    static int fibMemo(int n, int[] dp) {
        if (n <= 1) return n;
        
        if (dp[n] != 0) return dp[n];
        
        dp[n] = fibMemo(n - 1, dp) + fibMemo(n - 2, dp);
        return dp[n];
    }
    
    // Bottom-Up (Tabulation)
    static int fibTab(int n) {
        if (n <= 1) return n;
        
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        return dp[n];
    }
    
    // Space Optimized
    static int fibOptimized(int n) {
        if (n <= 1) return n;
        
        int prev2 = 0, prev1 = 1;
        
        for (int i = 2; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        
        return prev1;
    }
}
