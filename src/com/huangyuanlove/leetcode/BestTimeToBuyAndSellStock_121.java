package com.huangyuanlove.leetcode;

public class BestTimeToBuyAndSellStock_121 {
    public static void main(String[] args) {

    }


    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        int max = Integer.MIN_VALUE;
        int maxIndex =0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < min){
                min = prices[i];

            }


        }
        return max -min;

    }
}
