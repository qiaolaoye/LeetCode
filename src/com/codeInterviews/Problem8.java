package com.codeInterviews;

public class Problem8 {
    public int minNumberInRotateArray(int[] array) {

        /* �����д�����������������У����Կ��Ƕ��ֲ��ҵ�˼�� */
        if (array.length == 0) return 0;

        int index1 = 0;
        int index2 = array.length - 1;
        int mid = index1;

        while (array[index1] >= array[index2]) {
            if (index2 - index1 == 1) {
                mid = index2;
                break;
            }

            mid = (index1 + index2) / 2;
            if (array[mid] >= array[index1]) index1 = mid;
            else if (array[mid] <= array[index2]) index2 = mid;
        }

        return array[mid];
    }
}
