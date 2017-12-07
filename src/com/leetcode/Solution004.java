package com.leetcode;

public class Solution004 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int length = m + n;
        int[] merge = new int[length];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merge[k] = nums1[i];
                k++;
                i++;
            }
            else {
                merge[k] = nums2[j];
                k++;
                j++;
            }
        }
        if (i < m) {
            for (; i < m; i++, k++) {
                merge[k] = nums1[i];
            }
        }
        if (j < n) {
            for (; j < n; j++, k++) {
                merge[k] = nums2[j];
            }
        }

        if (length % 2 == 0) return (merge[length / 2] + merge[length / 2 - 1]) / 2.0;
        else return merge[(length - 1) / 2];
    }
}
