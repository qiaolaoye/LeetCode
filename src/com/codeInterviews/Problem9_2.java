package com.codeInterviews;

public class Problem9_2 {
    public int JumpFloorII(int target) {
        /**
         * 变态跳台阶
         * f(n) = f(n-1) + f(n-2) + f(n-3) + ... + f(0), f(0)表示直接跳上去
         * 初始值：f(0) = 1, f(1) = 1, f(2) = 2, f(3) = 4, f(4) = 8, f(5) = 16 ;
         * 规律： f(n) = 2^(n-1);
         */
        if (target <= 2) return target;
        int[] res = new int[target + 1];
        res[0] = 1;
        res[1] = 1;
        res[2] = 2;

        for (int i = 3; i <= target ; i++) {
            int temp = 0;
            for (int j = 0; j < i; j++) {
                temp += res[j];
            }
            res[i] = temp;
        }
        return res[target];
    }
}
