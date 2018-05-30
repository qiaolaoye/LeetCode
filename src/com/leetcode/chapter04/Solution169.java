package com.leetcode.chapter04;

public class Solution169 {
    public static int majorityElement(int[] nums) {
        int curValue = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == curValue) {
                count++;
            }
            else {
                count--;
                if (count == 0) {
                    curValue = nums[i];
                    count = 1;
                }
            }
        }
        return curValue;
    }
}
