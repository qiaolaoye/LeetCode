package com.leetcode.chapter03;

public class Solution121 {
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int curMaxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice)
                minPrice = prices[i];
            if (prices[i] - minPrice > curMaxProfit)
                curMaxProfit = prices[i] - minPrice;
        }

        return curMaxProfit;
    }
}
