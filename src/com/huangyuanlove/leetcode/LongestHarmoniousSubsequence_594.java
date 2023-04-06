package com.huangyuanlove.leetcode;

import java.util.Arrays;

public class LongestHarmoniousSubsequence_594 {
    public static void main(String[] args) {
        int nums[] = new int[]{1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }
    public static int findLHS(int[] nums) {

        Arrays.sort(nums);
        int result = 0;
        int begin = 0;
        for (int i = 0; i < nums.length; i++) {

            while (nums[i] - nums[begin] >1){
                begin ++;
            }
            System.out.println(i +"  " + nums[i] + " " + nums[begin]);
            if(nums[i] - nums[begin] == 1){
                result = Math.max(result,i-begin +1);
            }
        }
        return result;

    }
}
