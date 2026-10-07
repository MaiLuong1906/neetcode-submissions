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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node.val == subRoot.val){
                if(isSame(node, subRoot)) return true;
            }
            if(node.left != null) q.add(node.left);
            if(node.right != null) q.add(node.right);
        }
        return false;
    }
    public boolean isSame(TreeNode q, TreeNode p){
        if(q == null && p == null) return true;
        if(q == null || p == null) return false;
        if(q.val != p.val) return false;
        return isSame(q.left, p.left) && isSame(q.right, p.right);
    }
}
