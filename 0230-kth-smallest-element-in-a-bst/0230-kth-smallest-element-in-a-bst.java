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
/*---------------------------------------------------------------------
        Time Complexity = O(N)
        Space Complexity = O(N)
----------------------------------------------------------------------*/

// class Solution {
//     Queue<Integer> queue = new LinkedList<>();
    
//     public int kthSmallest(TreeNode root, int k) {
//         helper(root);

//         int i = 1;
//         int ans = 0;
//         while(!queue.isEmpty()){
//             if(i == k){
//                 ans = queue.poll();
//                 break;
//             }
//             i++;
//             queue.poll();
//         }
//         return ans;
//     }

//     private void helper(TreeNode root){
//         if(root == null) return;
//         helper(root.left);
//         queue.offer(root.val);
//         helper(root.right);
//     }
// }

/*---------------------------------------------------------------------
        Time Complexity = O(H)      OR      O(N)
        Space Complexity = O(1)
----------------------------------------------------------------------*/

class Solution {
    int prevOrder = 0;
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return -1;
        if(root.left != null){
            int leftAns = kthSmallest(root.left, k);
            if(leftAns != -1) return leftAns;
        }

        if(prevOrder+1 == k){
            return root.val;
        }
        prevOrder = prevOrder + 1;

        if(root.right != null){
            int rightAns = kthSmallest(root.right, k);
            if(rightAns != -1) return rightAns;
        }

        return -1;
    }

}