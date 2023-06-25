package com.huangyuanlove.leetcode;

public class MinimumSizeSubarraySum_209 {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int minLength = nums.length + 1;
        while (end < nums.length){
            sum += nums[end];
            while (sum >= target){
                minLength = Math.min(minLength,end - start+1);
                sum -= nums[start];
                start++;

            }
            end ++;
        }
        if(minLength == nums.length+1){
            return 0;
        }
        return minLength;

    }
}
