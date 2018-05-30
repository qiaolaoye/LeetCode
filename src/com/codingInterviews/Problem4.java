package com.codingInterviews;

public class Problem4 {
    public static String replaceSpace(StringBuffer str) {
        if (str == null) return null;
        char[] chars = str.toString().toCharArray();
        int count = 0;
        for (char aChar : chars) {
            if (aChar == ' ')
                count++;
        }

        /* 双指针控制下标 */
        int p1 = chars.length - 1;
        int p2 = chars.length + 2 * count - 1;
        char[] charArray = new char[p2 + 1];
        while (p1 >= 0 && p2 >= 0) {
            if (chars[p1] != ' ') {
                charArray[p2--] = chars[p1--];
            }
            else {
                charArray[p2--] = '0';
                charArray[p2--] = '2';
                charArray[p2--] = '%';
                p1--;
            }
        }
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace(new StringBuffer("Hello World")));
    }
}
