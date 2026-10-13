import java.util.*;

public class SubsetSum {
    public static void main(String[] args) {
        int[] nums = {3, 34, 4, 12, 5, 2};
        int target = 9;
        
        System.out.println("Can form sum " + target + ": " + canPartition(nums, target));
    }
    
    static boolean canPartition(int[] nums, int target) {
        int n = nums.length;
        boolean[][] dp = new boolean[n][target + 1];
        
        // Base case: sum 0 is always possible
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }
        
        // First element
        if (nums[0] <= target) {
            dp[0][nums[0]] = true;
        }
        
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= target; j++) {
                boolean notTake = dp[i - 1][j];
                boolean take = false;
                if (nums[i] <= j) {
                    take = dp[i - 1][j - nums[i]];
                }
                dp[i][j] = take || notTake;
            }
        }
        
        return dp[n - 1][target];
    }
}
