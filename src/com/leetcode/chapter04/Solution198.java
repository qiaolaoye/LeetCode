package com.leetcode.chapter04;

public class Solution198 {
    public static int rob(int[] nums) {
        if (nums.length <= 1) return (nums.length == 0) ? 0 : nums[0];

        // a is last max profit
        // b is current max profit
        // dp[i] = max(nums[i] + dp[i-2], dp[i-1])
        int a = nums[0];
        int b = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            int temp = b;
            b = Math.max(a + nums[i], b);
            a = temp;
        }

        return b;
    }
}
