package com.huangyuanlove.leetcode;

import java.util.Arrays;

public class ArrayPartition_561 {
    public static void main(String[] args) {
        System.out.println();
    }
    public static int arrayPairSum(int[] nums) {

        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i+=2) {
            result += nums[i];
        }
        return result;

    }
}
