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
    int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, preorder.length - 1);
    }

    public TreeNode build(int[] pre, int[] in, int left, int right){
        if(left > right) return null;
        int rootVal = pre[preIndex++];
        TreeNode root = new TreeNode(rootVal);

        int mid = left;
        while(in[mid] != rootVal){
            mid ++;
        }

        root.left = build(pre, in, left, mid - 1);
        root.right = build(pre, in, mid + 1, right);

        return root;
    }
}
