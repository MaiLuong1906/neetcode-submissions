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
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return root;
        if(root.val > key) root.left = deleteNode (root.left, key);
        else if(root.val < key) root.right = deleteNode(root.right, key);
        else{
            if(root.left == null && root.right == null)
                return null;
            if(root.left != null && root.right == null)
                return root.left;
            if(root.left == null && root.right != null)
                return root.right;
            TreeNode tmp = findLeftMostNode(root.right);

            root.val = tmp.val;
            root.right = deleteNode(root.right, tmp.val);
            
        }
        return root;
    }
    public static TreeNode findLeftMostNode(TreeNode root){
        if(root == null) return root;
        TreeNode tmp = root;
        while(tmp.left != null){
            tmp = tmp.left;
        }
        return tmp;
    }
}