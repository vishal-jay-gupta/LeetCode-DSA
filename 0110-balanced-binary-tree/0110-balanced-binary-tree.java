/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int height(TreeNode root){
        if(root == null) return 0;
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    Integer checkHeight = null;

    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        checkHeight = Math.abs(leftHeight - rightHeight);
        if(checkHeight > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}