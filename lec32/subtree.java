/*
 * INTERVIEW QUESTIONS - Subtree of Another Tree:
 *
 * Q1: What is a subtree?
 * A: A tree that is completely contained within another tree
 *
 * Q2: How to check if two trees are identical?
 * A: Same structure AND same values at corresponding nodes
 *
 * Q3: Algorithm to check subtree?
 * A: For each node in main tree, check if subtree rooted there is identical
 *
 * Q4: Time complexity?
 * A: O(m * n) where m and n are sizes of the two trees
 *
 * Q5: Can we optimize?
 * A: Yes, using tree serialization and string matching: O(m + n)
 *
 * Q6: What if subRoot is null?
 * A: Empty tree is subtree of any tree - return true
 */
class Solution {

    // Q: How to check if two trees are identical?
    // A: Both null (identical) OR same value AND identical children
    public boolean isIdentical(TreeNode root, TreeNode subRoot) {

        // Q: Both null? A: Trees are identical
        if (root == null && subRoot == null) {
            return true;
        }

        // Q: One null, one not? A: Not identical
        if (root == null || subRoot == null) {
            return false;
        }

        // Q: What must match for identical? A: Value + both subtrees
        if (root.val == subRoot.val) {
            return isIdentical(root.left, subRoot.left) &&
                   isIdentical(root.right, subRoot.right);
        }

        return false;
    }

    // Q: Main function to check if subRoot is subtree of root
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        // Q: Is empty tree a subtree? A: Yes, of any tree
        if (subRoot == null) {
            return true;
        }

        // Q: If main tree is empty but subRoot is not? A: Can't be subtree
        if (root == null) {
            return false;
        }

        // Q: When values match, what do we check?
        // A: If subtree rooted here is identical to subRoot
        if (root.val == subRoot.val) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        // Q: If not found at root, where to search?
        // A: In left subtree OR right subtree
        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }
}
