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
    public int goodNodes(TreeNode root) {
        if(root == null) return 0;
        return countGoodNodes(root, root.val);
    }
    public int countGoodNodes(TreeNode root, int maxVal){
        if(root == null) return 0;
        int res = 0;
        if(root.val >= maxVal){
            maxVal = root.val;
            res = 1;
        }
        res += countGoodNodes(root.left, maxVal);
        res += countGoodNodes(root.right, maxVal);
        return res;
    }
}
