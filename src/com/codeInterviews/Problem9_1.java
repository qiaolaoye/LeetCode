package com.codeInterviews;

public class Problem9_1 {
    public int JumpFloor(int target) {
        /* 转换为斐波那契数列问题 f(n) = f(n-1) + f(n-2) */
        if (target <= 2) return target;
        int f1 = 1;
        int f2 = 2;
        int res = 0;
        for (int i = 3; i <= target; i++) {
            res = f1 + f2;
            f1 = f2;
            f2 = res;
        }

        return res;
    }
}
