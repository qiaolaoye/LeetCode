package com.leetcode.chapter03;

import com.leetcode.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution104 {
    public static int maxDepth(TreeNode root) {
        if (root != null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static int maxDepth_(TreeNode root) {
        if (root == null) return 0;
        int level = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int curNum = 1; // num of nodes left in current level.
        int nextNum = 0; // num of nodes in next level

        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            curNum--;
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

        return level;
    }
}
