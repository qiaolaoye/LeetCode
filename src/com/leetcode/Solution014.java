package com.leetcode;

public class Solution014 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        int len = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            len = (strs[i].length() < len) ? strs[i].length() : len;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++) {
            boolean flag = true;
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != ch) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) sb.append(ch);
            else break;
        }

        return sb.toString();
    }
}
