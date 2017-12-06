package com.leetcode;

public class Solution009 {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int len = 1;
        while (x / len >= 10)
            len *= 10;

        while (x > 0) {
            int left = x / len;
            int right = x % 10;
            if (left != right) return false;
            else {
                x = (x % len) / 10;
                len /= 100;
            }
        }
        return true;
    }
}
