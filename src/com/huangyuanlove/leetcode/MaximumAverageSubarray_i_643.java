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
        int preSum = sum;


        for (int i = k; i < nums.length; i++) {
            int tm= preSum +nums[i] - nums[i-k];
            sum = Math.max(tm,sum);
            preSum = tm;

        }
        return  sum *1.0/k;


    }
}
