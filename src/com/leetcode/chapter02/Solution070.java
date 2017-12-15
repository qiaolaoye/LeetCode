package com.leetcode.chapter02;

public class Solution070 {
    public static int climbStairs(int n) {
        if (n == 0 || n == 1 || n == 2) return n;
        int[] dp = new int[n];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n - 1] + dp[n - 2];
    }
}
