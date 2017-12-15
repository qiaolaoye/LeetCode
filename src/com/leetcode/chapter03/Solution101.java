package com.leetcode.chapter03;

import com.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution101 {

    // Recursive solution.
    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return ST(root.left, root.right);
    }

    private static boolean ST(TreeNode left, TreeNode right) {
        TreeNode l = left;
        TreeNode r = right;
        if (l == null && r == null) return true;
        else if (l != null && right != null) return l.val == r.val && ST(l.left, r.right) && ST(l.right, r.left);
        else return false;
    }

    // Iterative solution.
    public static boolean isSymmetric_(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return true;

        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.offer(root.left);
        q2.offer(root.right);
        while(!q1.isEmpty() && !q2.isEmpty()) {
            TreeNode p = q1.poll();
            TreeNode q = q2.poll();
            if (p == null) {
                if (q != null) return false;
                else continue;
            }
            if (q == null || p.val != q.val) return false;

            q1.offer(p.left);
            q2.offer(q.right);
            q2.offer(p.right);
            q1.offer(q.left);
        }

        return true;
    }
}
