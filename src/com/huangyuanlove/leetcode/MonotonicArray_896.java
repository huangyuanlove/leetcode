package com.huangyuanlove.leetcode;

public class MonotonicArray_896 {
    public static void main(String[] args) {

    }

    public boolean isMonotonic(int[] nums) {
        if(nums.length == 1 || nums .length ==2){
            return true;
        }
        boolean isIncrease = false; //是否递增
        boolean isDecrease = false; //是否递减
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
                isIncrease = true;
            }
            if(nums[i] < nums[i-1]){
                isDecrease = true;
            }
            if(isIncrease && isDecrease){
                return false;
            }
        }
        return true;

    }
}
