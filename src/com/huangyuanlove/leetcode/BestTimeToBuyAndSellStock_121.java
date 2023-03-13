package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

import java.util.Collections;

public class BestTimeToBuyAndSellStock_121 {
    public static void main(String[] args) {
        int [] prices = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
        ArrayListHelper.printList(prices);
    }


    public static int maxProfit(int[] prices) {
        for (int i = 1; i < prices.length; i++) {
            prices[i-1] = prices[i] - prices[i-1];
        }
        int maxSum =0;
        int thisSum = 0;
        for (int i = 0; i <prices.length-1; i++) {

            thisSum += prices[i];
            if(thisSum>maxSum){
                maxSum = thisSum;
            }else if(thisSum <0){
                thisSum = 0;
            }

        }
        return maxSum;

    }
}
