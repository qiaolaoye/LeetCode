package com.leetcode.chapter01;

public class Solution007 {
    public static int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int temp = ans * 10 + x % 10;
            if (temp / 10 != ans)
                return 0;
            ans = temp;
            x /= 10;
        }
        return ans;
    }
}
