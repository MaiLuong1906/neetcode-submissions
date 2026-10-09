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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        q.add(root);
        while(!q.isEmpty()){
            TreeNode tmp = q.peek();
            list.add(tmp.val);
            Queue<TreeNode> q2 = new LinkedList<>();
            while(!q.isEmpty()){
                TreeNode node = q.poll();
                if (node.right != null) q2.add(node.right);
                if(node.left != null) q2.add(node.left);
            }
            q = q2;
        }
        return list;
    }
}
