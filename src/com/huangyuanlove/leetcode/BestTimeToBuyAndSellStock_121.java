package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

import java.util.Collections;
import java.util.Map;

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
    public static int maxProfit1(int[] prices){
        if(prices.length <=1){
            return 0;
        }
        int min = prices[0];
        int max = 0;
        for (int i = 1; i <prices.length ; i++) {
            max = Math.max((prices[i] - min), max);
            min = Math.min(prices[i],min);
        }
        return max;
    }
}
