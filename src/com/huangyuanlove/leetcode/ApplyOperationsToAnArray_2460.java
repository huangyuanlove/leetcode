package com.huangyuanlove.leetcode;

public class ApplyOperationsToAnArray_2460 {
    public static void main(String[] args) {

//        [1,4,0,0,3,0,2,0,0]
    }

    public int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        int index = 0;
        int[] result = new int[nums.length];


        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                result[index] = nums[i];
                index ++;
            }

        }

        return result;


    }
}
