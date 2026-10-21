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
    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        if(root == null) return root;

        bstToGst(root.right);
        sum += root.val;
        root.val = sum;
        bstToGst(root.left);

        return root;
    }

    // private TreeNode sumGst(TreeNode root){
    //     if(root.right == null && root.left == null) return root;

    //     TreeNode rightNode;
    //     if(root.right != null){
    //         sumGst(root.right);
    //     }

    //     root.val = root.val + rightNode.val;
        
    //     TreeNode leftNode;
    //     if(root.left != null){
    //         sumGst(root.left);
    //     }

    //     root.val = root.val + leftNode.val;
    //     return root;
    // }
}