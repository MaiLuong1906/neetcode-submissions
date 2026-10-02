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
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int i = q.size();
            List<Integer> tmp = new ArrayList<>();
            while(i > 0){
                TreeNode cur = q.poll();
                tmp.add(cur.val);
                if(cur.left != null )q.add(cur.left);
                if(cur.right != null)q.add(cur.right);
                i--;
            }
            res.add(tmp);
        }
        return res;
    }
}
