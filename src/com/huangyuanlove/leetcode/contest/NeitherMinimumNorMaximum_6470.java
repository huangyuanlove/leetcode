package com.huangyuanlove.leetcode.contest;

import java.util.Arrays;

public class NeitherMinimumNorMaximum_6470 {
    public static void main(String[] args) {

    }
    public int findNonMinOrMax(int[] nums) {
        if(nums.length <=2){
            return -1;
        }

        Arrays.sort(nums);
        return nums[1];

    }
}
