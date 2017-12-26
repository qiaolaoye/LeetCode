package com.leetcode.chapter03;

import java.util.Arrays;

public class Solution136 {
    public static int singleNumber_(int[] nums) {
        Arrays.sort(nums);
        int lastNum = nums[0];
        int curNum;
        int lastNumCount = 1;
        for (int i = 1; i < nums.length; i++) {
            curNum = nums[i];
            if (lastNumCount == 1) {
                if (curNum != lastNum) return lastNum;
                else {
                    lastNum = curNum;
                    lastNumCount++;
                }
            }
            else { // count == 2
                lastNum = curNum;
                lastNumCount = 1;
            }
        }
        return lastNum;
    }

    public static int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans ^= nums[i];
        }
        return ans;
    }
}
