package com.leetcode;

import java.util.Arrays;

public class Solution006 {
    public static String convert(String s, int numRows) {
        if (s.length() == 0 || numRows <= 1)
            return s;

        String[] ans = new String[numRows];
        Arrays.fill(ans, "");
        int row = 0, delta = 1;

        for (int i = 0; i < s.length(); i++) {
            ans[row] += s.charAt(i);
            row += delta;
            if (row >= numRows) {
                row = numRows - 2;
                delta = -1;
            }
            if (row < 0) {
                row = 1;
                delta = 1;
            }
        }

        String ret = "";
        for (int i = 0; i < ans.length; i++)
            ret += ans[i];
        return ret;
    }
}
