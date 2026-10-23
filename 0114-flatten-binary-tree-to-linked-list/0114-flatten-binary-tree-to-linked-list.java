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
    public void flatten(TreeNode root) {
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        Queue<TreeNode> q = new LinkedList<>();

        addIntoQueue(root, q);
        TreeNode prev = null;
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            node.left = null;
            if(prev != null){
                prev.right = node;
            }
            prev = node;
        }
    }

    private void addIntoQueue(TreeNode root, Queue<TreeNode> q){
        if(root == null) return;
        q.add(root);
        addIntoQueue(root.left, q);
        addIntoQueue(root.right, q);
    }
}