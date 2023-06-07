package com.huangyuanlove.leetcode;

public class HowManyNumbersAreSmallerThanTheCurrentNumber_1356 {
    public static void main(String[] args) {

    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int result[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] < nums[i]){
                    result[i]++;
                }
            }
        }
        return result;

    }
}
