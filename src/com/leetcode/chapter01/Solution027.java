package com.leetcode.chapter01;

public class Solution027 {
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[index] = nums[j];
                ++index;
            }
        }
        return index;
    }
}
