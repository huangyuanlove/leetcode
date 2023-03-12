package com.huangyuanlove.leetcode;

public class SingleNumber_136 {
    public static void main(String[] args) {

    }
    public static int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int result = nums[0];
        for (int i =1;i<nums.length;i++){
            result = result ^ nums[i];
        }
        return result;

    }
}
