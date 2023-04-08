package com.huangyuanlove.leetcode;

import java.util.HashSet;

public class SetMismatch_645 {

    public static void main(String[] args) {

    }

    public static int[] findErrorNums(int[] nums) {
        int []result =new int[2];
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if(set.add(nums[i])){
                sum += nums[i];
            }else{
                result[0] = nums[i];
            }
        }

        result[1] = (nums.length +1) * nums.length /2 - sum;
        return  result;

    }
}
