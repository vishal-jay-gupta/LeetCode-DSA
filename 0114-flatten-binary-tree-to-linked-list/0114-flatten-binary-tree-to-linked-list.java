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
import java.util.*;
class Solution {
    /*---------------------------------------------------------------------------------------------
            Time Complexity = O(2n) = O(n)
            Space Complexity = O(2n) = O(n)
    --------------------------------------------------------------------------------------------*/
    // public void flatten(TreeNode root) {
    //     if(root == null) return;
    //     if(root.left == null && root.right == null) return;
    //     Queue<TreeNode> q = new LinkedList<>();

    //     preorder(root, q);
    //     TreeNode prev = null;
    //     while(!q.isEmpty()){
    //         TreeNode node = q.poll();
    //         node.left = null;
    //         if(prev != null){
    //             prev.right = node;
    //         }
    //         prev = node;
    //     }
    // }

    // private void preorder(TreeNode root, Queue<TreeNode> q){
    //     if(root == null) return;
    //     q.add(root);
    //     preorder(root.left, q);
    //     preorder(root.right, q);
    // }

    /*---------------------------------------------------------------------------------------------
            Time Complexity = O(n)
            Space Complexity = O(1)
    --------------------------------------------------------------------------------------------*/
    public void flatten(TreeNode root) {
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        
        TreeNode curr = root;
        while(curr != null){
            if(curr.left != null){
                TreeNode temp = curr.left;

                while(temp.right != null){
                    temp = temp.right;
                }

                temp.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }
}