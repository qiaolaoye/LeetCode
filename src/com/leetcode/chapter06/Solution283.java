package com.leetcode.chapter06;

public class Solution283 {
    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        int idx = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0)
                nums[idx++] = nums[i];
        }
        for (int i = idx; i < len; i++) {
            nums[i] = 0;
        }
    }
}
