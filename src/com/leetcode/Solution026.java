package com.leetcode;

public class Solution026 {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int index = 1;  // Remember the subscript of the first element that is not equal
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
