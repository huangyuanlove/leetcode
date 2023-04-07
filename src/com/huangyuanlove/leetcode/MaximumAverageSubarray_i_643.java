package com.huangyuanlove.leetcode;

import java.util.Spliterator;

public class MaximumAverageSubarray_i_643 {

    public static void main(String[] args) {

        System.out.println(findMaxAverage(new int[]{0,4,0,3,2},1));
    }
    public static double findMaxAverage(int[] nums, int k) {

        int sum =0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        System.out.println(sum);

        for (int i = 1; i < nums.length; i++) {
            int tm= sum +nums[i] - nums[i-k];
            sum = Math.max(tm,sum);
            System.out.println(sum);

        }
        return  sum *1.0/k;


    }
}
