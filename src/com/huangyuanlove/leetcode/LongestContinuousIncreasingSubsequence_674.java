package com.huangyuanlove.leetcode;

public class LongestContinuousIncreasingSubsequence_674 {
    public static void main(String[] args) {

    }

    public static int findLengthOfLCIS(int[] nums) {
        if(nums.length ==1){
            return 1;
        }
        int max =1;
        int current = 1;
        for (int i = 1; i < nums.length; i++) {
           if(nums[i] > nums[i-1]){
               current ++;
           }else{
               max = Math.max(current,max);
               current = 1;
           }
        }
        return  Math.max(max,current);

    }
}
