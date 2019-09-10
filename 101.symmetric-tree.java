/*
 * @lc app=leetcode id=101 lang=java
 *
 * [101] Symmetric Tree
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        TreeNode left = root.left, right = root.right;
        return isSymmetric(left, right);
    }

    private boolean isSymmetric(TreeNode n1, TreeNode n2) {
        if(n1==null && n2==null)
            return true;
        if(n1==null || n2==null)
            return false;
        if(n1.val != n2.val)
            return false;
        return isSymmetric(n1.left, n2.right) && isSymmetric(n1.right, n2.left);
    }
}

