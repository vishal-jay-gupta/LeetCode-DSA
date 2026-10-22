import java.util.*;

class Solution {
    public int maxLevelSum(TreeNode root) {
        if(root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int curr = 0;
        int max = Integer.MIN_VALUE;
        int level = 1;
        int ans = 0;
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node != null){
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);

                curr += node.val;  
            }else{
                if(curr > max){
                    max = curr;
                    ans = level;
                }

                if(q.isEmpty()) break;

                q.add(null);
                level++;
                curr = 0;
            }

        }

        return ans;
    }
}