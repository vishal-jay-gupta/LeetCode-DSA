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
    // private void constructTree(TreeNode root, TreeNode ch){
    //     if(root == null) return;

    //     if(root.val > ch.val){
    //         if(root.left != null) constructTree(root.left, ch);
    //         else root.left = ch;
    //     }else{
    //         if(root.right != null) constructTree(root.right, ch);
    //         else root.right = ch;
    //     }

    // }

    // public TreeNode bstFromPreorder(int[] preorder) {
    //     TreeNode root = new TreeNode(preorder[0]);

    //     if(preorder.length == 1) return root;

    //     for(int i=1; i<preorder.length; i++){
    //         constructTree(root, new TreeNode(preorder[i]));
    //     }

    //     return root;
    // }


    int i = 0;

    public TreeNode bstFromPreorder(int[] preorder) {
        return build(preorder, Integer.MAX_VALUE);
    }

    private TreeNode build(int[] pre, int bound) {
        if(i == pre.length || pre[i] > bound){
            return null;
        }

        TreeNode root = new TreeNode(pre[i++]);

        root.left = build(pre, root.val);
        root.right = build(pre, bound);

        return root;
    }
}