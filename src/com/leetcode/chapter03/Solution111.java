package com.leetcode.chapter03;

import com.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution111 {
    public static int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null) return minDepth(root.right) + 1;
        if (root.right == null) return minDepth(root.left) + 1;
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    public static int minDepth_(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int curNum = 1;
        int nextNum = 0;
        int level = 1;

        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            curNum--;
            if (cur.left == null && cur.right == null) return level;

            if (cur.left != null) {
                queue.offer(cur.left);
                nextNum++;
            }
            if (cur.right != null) {
                queue.offer(cur.right);
                nextNum++;
            }
            if (curNum == 0) {
                curNum = nextNum;
                nextNum = 0;
                level++;
            }
        }

        return -1; // cannot access here.
    }
}
