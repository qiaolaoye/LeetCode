package com.leetcode.chapter02;

public class Solution053 {

    /**
     * maxSubArray(int[] A, int i) means the maxSubArray for A[0:i] which must has A[i] as the end element.
     * maxSubArray(A, i) = (maxSubArray(A, i-1) > 0 ? maxSubArray(A, i-1) : 0) + A[i]
     */
    public static int maxSubArray(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length]; // dp[i] means the maximum subarray ending with nums[i].
        dp[0] = nums[0];
        int max = dp[0];

        for (int i = 1; i < length; i++) {
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}
