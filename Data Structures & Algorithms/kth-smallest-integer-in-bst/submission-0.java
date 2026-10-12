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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<TreeNode> list = new ArrayList<>();
        inorder(root, list);
        return list.get(k-1).val;
    }
    public void inorder(TreeNode root, ArrayList<TreeNode> list){
        if(root == null) return ;
        inorder(root.left, list);
        list.add(root);
        inorder(root.right, list);
    }
}
