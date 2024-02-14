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
    public boolean isValidBST(TreeNode root) {
       return help(root, null,null);   
    }
    boolean help(TreeNode root, Integer low, Integer high){
        if (root == null) return true;
        return(low == null|| root.val>low) && (high == null || root.val < high) && help(root.left, low,root.val) && help(root.right, root.val, high);
    }
}