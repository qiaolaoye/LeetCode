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

    /* ���Ž⣬��һ��������ȥ1������ԭ�����������㣬��Ѹ����������Ƶ����ұ�һ��1���0 */
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            ++count;
            n = (n - 1) & n;
        }
        return count;
    }

}
