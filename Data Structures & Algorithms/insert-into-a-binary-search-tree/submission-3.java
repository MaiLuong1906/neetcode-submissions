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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        TreeNode cur = root;
        TreeNode prev = root;
        while(cur != null){
            prev = cur;
            if(cur.val < val){
                cur = cur.right;
            }
            else cur = cur.left;
        }
        TreeNode tmp = new TreeNode(val);
        if(prev.val < val) prev.right = tmp;
        else prev.left = tmp;
        return root;
    }
}