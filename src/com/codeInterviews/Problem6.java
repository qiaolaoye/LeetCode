package com.codeInterviews;

import java.util.Arrays;

public class Problem6 {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        /* 递归出口要找清楚  */
        if (pre.length == 0) return null;
        if (pre.length == 1) return new TreeNode(pre[0]);
        int rootValue = pre[0];

        int count = 0;
        while (in[count] != rootValue && count < in.length) {
            count++;
        }
        int leftNodeNumber = count;
        int rightNodeNumber = in.length - count - 1;

        int[] preLeft = new int[leftNodeNumber];
        int[] preRight = new int[rightNodeNumber];
        int[] inLeft = new int[leftNodeNumber];
        int[] inRight = new int[rightNodeNumber];

//        System.arraycopy(pre, 1, preLeft, 0, leftNodeNumber);
//        System.arraycopy(pre, count + 1, preRight, 0, rightNodeNumber);
//        System.arraycopy(in, 0, inLeft, 0, leftNodeNumber);
//        System.arraycopy(in, count + 1, inRight, 0, rightNodeNumber);
        preLeft = Arrays.copyOfRange(pre, 1, leftNodeNumber + 1);
        preRight = Arrays.copyOfRange(pre, leftNodeNumber + 1, pre.length);
        inLeft = Arrays.copyOfRange(in, 0, count);
        inRight = Arrays.copyOfRange(in, count + 1, in.length);

        /* 构造二叉树 */
        TreeNode root = new TreeNode(rootValue);
        root.left = reConstructBinaryTree(preLeft, inLeft);
        root.right = reConstructBinaryTree(preRight, inRight);
        return root;
    }

}
