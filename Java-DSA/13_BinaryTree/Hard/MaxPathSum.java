import java.util.*;

public class MaxPathSum {
    
    static class TreeNode {
        int val;
        TreeNode left, right;
        
        TreeNode(int val) {
            this.val = val;
        }
    }
    
    static int maxSum;
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        
        int result = maxPathSum(root);
        System.out.println("Maximum path sum: " + result);
    }
    
    public static int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        dfs(root);
        return maxSum;
    }
    
    private static int dfs(TreeNode node) {
        if (node == null) return 0;
        
        int leftMax = Math.max(0, dfs(node.left));
        int rightMax = Math.max(0, dfs(node.right));
        
        maxSum = Math.max(maxSum, node.val + leftMax + rightMax);
        
        return node.val + Math.max(leftMax, rightMax);
    }
}
