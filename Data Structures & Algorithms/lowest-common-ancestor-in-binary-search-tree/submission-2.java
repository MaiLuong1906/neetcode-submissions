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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode check1 = root;
        TreeNode check2 = root;
        List<TreeNode> l1 = new ArrayList<>();
        List<TreeNode> l2 = new ArrayList<>();
        while(true){
            if(!l1.contains(check1)){
                l1.add(check1);
            }
            if(!l2.contains(check2)){
                l2.add(check2);
            }
            if(p.val > check1.val){
                check1 = check1.right;
            }
            else if (p.val == check1.val){}
            else check1 = check1.left;
            if(q.val > check2.val){
                check2 = check2.right;
            }
            else if (q.val == check2.val){}
            else check2 = check2.left;
            
            if(p.val == check1.val && q.val == check2.val){
                if(l1.size() > l2.size()){
                    for(int i = l2.size() - 1; i >= 0; i--){
                        if(l1.contains(l2.get(i))){
                            return l2.get(i);
                        }
                    }
                }
                else{
                    for(int i = l1.size() - 1; i >= 0; i--){
                        if(l2.contains(l1.get(i))){
                            return l1.get(i);
                        }
                    }
                }
            }
        }
    }
}
