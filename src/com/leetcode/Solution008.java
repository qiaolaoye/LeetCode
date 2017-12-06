package com.leetcode;

public class Solution008 {
    public static int myAtoi(String str) {
        if (str == null || str.length() == 0)
            return 0;

        long sum = 0;
        int sign = 1, start = 0;
        str = str.trim();
        char firstCharacter = str.charAt(0);

        if (firstCharacter == '+') {
            sign = 1;
            ++start;
        }
        if (firstCharacter == '-') {
            sign = -1;
            ++start;
        }

        for (int i = start; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return (int) (sign * sum);
            }
            sum = sum * 10 + str.charAt(i) - '0';

            if (sign == 1 && sum > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign == -1 && (-1) * sum < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }

        return (int) (sign * sum);
    }
}
