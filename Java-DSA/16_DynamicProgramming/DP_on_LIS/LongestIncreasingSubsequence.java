import java.util.*;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        
        System.out.println("LIS length (DP): " + lisDP(nums));
        System.out.println("LIS length (Binary Search): " + lisBinarySearch(nums));
    }
    
    // O(n^2) DP approach
    static int lisDP(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        
        int maxLen = 1;
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }
        
        return maxLen;
    }
    
    // O(n log n) Binary Search approach
    static int lisBinarySearch(int[] nums) {
        ArrayList<Integer> sub = new ArrayList<>();
        
        for (int num : nums) {
            int pos = Collections.binarySearch(sub, num);
            if (pos < 0) {
                pos = -(pos + 1);
            }
            
            if (pos == sub.size()) {
                sub.add(num);
            } else {
                sub.set(pos, num);
            }
        }
        
        return sub.size();
    }
}
