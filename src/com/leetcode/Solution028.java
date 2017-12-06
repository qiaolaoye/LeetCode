package com.leetcode;

public class Solution028 {
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;

        int nLength = needle.length();
        char start = needle.charAt(0);
        for (int i = 0; i <= haystack.length() - nLength; i++) {
            if (haystack.charAt(i) != start) continue;
            else {
                boolean breakFlag = false;
                for (int j = 0; j < nLength; j++) {
                    if (haystack.charAt(i+j) != needle.charAt(j)) {
                        breakFlag = true;
                        break;
                    }
                }
                if (!breakFlag) return i;
            }
        }
        return -1;
    }
}
