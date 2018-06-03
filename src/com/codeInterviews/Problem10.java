package com.codeInterviews;

public class Problem10 {

//    public int NumberOf1(int n) {
//        String str = Integer.toBinaryString(n);
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == '1') count++;
//        }
//        return count;
//    }

//    public int NumberOf1(int n) {
//        int count = 0;
//        int flag = 1;
//        while (flag != 0) {
//            if ((n & flag) != 0) count++;
//            flag = flag << 1;
//        }
//        return count;
//    }

    /* 最优解，把一个整数减去1，再与原整数做与运算，会把该整数二进制的最右边一个1变成0 */
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            ++count;
            n = (n - 1) & n;
        }
        return count;
    }

}
