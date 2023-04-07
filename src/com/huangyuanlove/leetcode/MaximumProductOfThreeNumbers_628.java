package com.huangyuanlove.leetcode;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers_628 {

    public static void main(String[] args) {

    }

    public static int maximumProduct(int[] nums) {

        Arrays.sort(nums);
        //可能有负数，负数的个数大于两个，就需要选择负数了，

        return Math.max(nums[nums.length-1] * nums[nums.length-2] *nums[nums.length-3],nums[nums.length-1] * nums[1] *nums[0]);





    }
}
