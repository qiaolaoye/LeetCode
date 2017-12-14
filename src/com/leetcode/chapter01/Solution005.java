package com.leetcode.chapter01;

public class Solution005 {
    public static String longestPalindrome_(String s) {
        int length = s.length();
        if (length <= 1) return s;

        int maxLength = 1; // palindrome string's length
        int start = 0;
        int end = 0;

        for (int i = 0; i < length; i++) { // start
            for (int j = i + 1; j < length; j++) { // end
                int tmp1, tmp2;
                for (tmp1 = i, tmp2 = j; tmp1 < tmp2; tmp1++, tmp2--) { // Determine whether the substring is a palindrome string.
                    if (s.charAt(tmp1) != s.charAt(tmp2)) break;
                }
                if (tmp1 >= tmp2 && (j - i + 1) > maxLength) {
                    maxLength = j - i + 1;
                    start = i;
                    end = j;
                }
            }
        }
        return s.substring(start, end + 1);
    }

    /**
     * Dynamic Programming.
     *
     * P[i,j] = 0 false
     * P[i,j] = 1 true
     * P[i,i] = 1
     *
     * P[i,j] = P[i+1,j-1], if (s[i] = s[j]);
     * p[i,j] = 0, if (s[i] != s[j]);
     */
    public static String longestPalindrome(String s) {
        int length = s.length();
        int start = 0;
        int end = 0;

        boolean[][] P = new boolean[length][length];
        for (int i = 0; i < length; i++) { // initialization
            P[i][i] = true;
            if (i < length - 1 && s.charAt(i) == s.charAt(i+1)) {
                P[i][i+1] = true;
                start = i;
                end = i + 1;
            }
        }

        for (int len = 3; len <= length; len++) { // substring's length
            for (int i = 0; i <= length - len; i++) { // substring start index
                int j = i + len - 1; // substring end index
                if (P[i+1][j-1] == true && s.charAt(i) == s.charAt(j)) {
                    P[i][j] = true;
                    start = i;
                    end = j;
                }
            }
        }
        return s.substring(start, end + 1);
    }
}
