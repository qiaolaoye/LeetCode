package com.codeInterviews;

public class Problem9_3 {
    public int RectCover(int target) {
        /* 矩形覆盖问题：还是转化为斐波那契数列 */
        if (target <= 2) return target;
        int f1 = 1;
        int f2 = 2;
        int fn = 0;
        for (int i = 3; i <= target ; i++) {
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }
}
