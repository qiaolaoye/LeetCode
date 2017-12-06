package com.leetcode;

/**
 * Class Main is used to test other classes
 */
public class Main {

    public static void main(String[] args) {
	    // write your code here
        int[] nums = {1,3,5,6,8,10};
        int target = 11;
        System.out.println(Solution035.searchInsert(nums, target));
    }
}

