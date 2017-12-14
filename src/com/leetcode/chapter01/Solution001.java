package com.leetcode.chapter01;

import java.util.HashMap;
import java.util.Map;

public class Solution001 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complment = target - nums[i];
            if (map.containsKey(complment))
                return new int[] {i, map.get(complment)};
            else
                map.put(nums[i], i);
        }
        return null;
    }
}
