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
    public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null){
            return list;
        }

        // list.add(new ArrayList<>());
        // list[0].get(root.val);

        queue.add(root);
        queue.add(null);
        list.add(new ArrayList<>());

        int idx = 0;
        while(!queue.isEmpty()){
            TreeNode currNode = queue.remove();
            if(currNode == null){
                if(queue.isEmpty()){
                    break;
                }else{
                    idx++;
                    list.add(new ArrayList<>());
                    queue.add(null);
                }
            }else{
                list.get(idx).add(currNode.val);
                // i have to add node in list;

                if(currNode.left != null){
                    queue.add(currNode.left);
                }

                if(currNode.right != null){
                    queue.add(currNode.right);
                }
            }
        }
        return list;
    }
}