package com.huangyuanlove.leetcode;

public class FindPivotIndex_724 {
    public static void main(String[] args) {

    }

    public int pivotIndex(int[] nums) {
     int sum = 0;
     int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if(leftSum *2 + nums[i] == sum){
                return i;
            }else{
                leftSum +=nums[i];
            }
        }
        return -1;


    }
}
