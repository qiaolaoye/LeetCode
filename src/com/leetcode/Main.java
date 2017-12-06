package com.leetcode;

import java.util.Arrays;

/**
 * Class Main is used to test other classes
 */
public class Main {

    public static void main(String[] args) {
	    // write your code here
        int[] nums = {1,2,3,4,5,6,7,8};
        int target = 11;
        System.out.println(Arrays.toString(Solution001.twoSum(nums, target)));
    }
}

