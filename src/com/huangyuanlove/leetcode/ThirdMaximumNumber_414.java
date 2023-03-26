package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

import java.util.Arrays;

public class ThirdMaximumNumber_414 {
    public static void main(String[] args) {
        thirdMax(new int[]{1,2,3,4});
    }

    public static  int thirdMax(int[] nums) {
        Integer max = null;
        for (int i = 0; i < nums.length; i++) {
            if(max == null){
                max = nums[i];
            }else{
                if(nums[i] > max){
                    max = nums[i];
                }
            }

        }
        Integer  second =null;
        for (int i = 0; i < nums.length; i++) {
            if(second == null){
                if(nums[i] < max){
                    second = nums[i];
                }
            }else{
                if(nums[i] > second && nums[i]<max){
                    second = nums[i];
                }
            }

        }
        if(second == null){
            return max;
        }


        Integer third = null;
        for (int i = 0; i < nums.length; i++) {
            if(third == null){
                if(nums[i] < second){
                    third = nums[i];
                }
            }else{
                if(nums[i] > third && nums[i]<second){
                    third = nums[i];
                }
            }
        }

        if(third != null){
            return  third;
        }
        return max;



    }
}
