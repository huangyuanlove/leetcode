package com.huangyuanlove.leetcode;

public class MaxConsecutiveOnes_485 {

    public static void main(String[] args) {

    }
    public static int findMaxConsecutiveOnes(int[] nums) {

        int max =0;
        int count =0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                count ++;
            }else{
                max = Math.max(count,max);
                count =0;
            }
        }
        return  Math.max(count,max);

    }
}
