package com.huangyuanlove.leetcode;

public class ShuffleTheArray_1470 {
    public static void main(String[] args) {

    }
    public int[] shuffle(int[] nums, int n) {
        int [] result = new int[nums.length];

        for (int i = 0; i < n; i++) {
            result[i*2] = nums[i];
            result[i*2+1] = nums[i+n];
        }


        return result;
    }
}
