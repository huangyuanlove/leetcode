package com.huangyuanlove.leetcode;

public class SortArrayByParity_905 {

    public int[] sortArrayByParity(int[] nums) {
        if(nums.length ==1){
            return nums;
        }

        int start = 0;
        int end = nums.length-1;

        while (start < end){
            //偶数在前，奇数在后
            boolean startEven =  (nums[start] &1) ==0;
            boolean endOdd = (nums[end] &1) == 1;
            if(startEven && endOdd){
                start ++;
                end --;
            }else if(startEven && !endOdd){
                start++;
            }else if(!startEven && endOdd){
                end--;
            }else{

                int tmp = nums[start];
                nums[start] = nums[end];
                nums[end] = tmp;
                start ++;
                end --;

            }

        }
        return nums;

    }

}
