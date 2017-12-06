package com.leetcode;

import java.util.Arrays;

public class Solution016 {
    public static int threeSumClosest(int[] nums, int target) {
        int ans = 0;
        if (nums.length <= 3) {
            for (int i : nums) {
                ans += i;
            }
            return ans;
        }

        Arrays.sort(nums);
        ans = nums[0] + nums[1] + nums[2];
        int sum = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(target - ans) > Math.abs(target - sum)) {
                    ans = sum;
                    if (ans == target) return ans;
                }
                if (sum > target) k--;
                else j++;
            }
        }
        return ans;
    }
}
