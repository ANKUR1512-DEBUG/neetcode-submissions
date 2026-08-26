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
    int d=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return d;
        
    }
    private int height(TreeNode root){
        if(root==null){
            return 0;
        }
        else{
            int a=height(root.left);
            int b=height(root.right);
            d=Math.max(d,a+b);
            return 1+ Math.max(a,b);

        }
    }
}
