package com.leetcode.chapter05;

import com.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution226 {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
        TreeNode left = invertTree(root.right);
        TreeNode right = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }

    // level traversal
    public static TreeNode invertTree_(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null)
            return root;
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode pNode = queue.poll();
            TreeNode tmpNode = pNode.left;
            pNode.left = pNode.right;
            pNode.right = tmpNode;

            if (pNode.left != null) queue.offer(pNode.left);
            if (pNode.right != null) queue.offer(pNode.right);
        }
        return root;
    }
}
