package com.leetcode.chapter02;

public class Solution058 {
    public static int lengthOfLastWord_(String s) {
        String[] strings = s.split(" ");
        if (strings.length == 0) return 0;
        return strings[strings.length - 1].length();
    }

    public static int lengthOfLastWord(String s) {
        int len = 0;
        int tail = s.length() - 1;
        while (tail >= 0 && s.charAt(tail) == ' ') tail--;
        while (tail >= 0 && s.charAt(tail) != ' ') {
            len++;
            tail--;
        }
        return len;
    }
}
