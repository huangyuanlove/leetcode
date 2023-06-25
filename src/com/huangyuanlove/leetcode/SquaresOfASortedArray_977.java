package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

import java.util.Arrays;

public class SquaresOfASortedArray_977 {
    public static void main(String[] args) {
        ArrayListHelper.printList(sortedSquares1(new int[]{-4,-1,0,3,10}));
    }

    public int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static int[] sortedSquares1(int[] nums){
        int start = 0;
        int end = nums.length -1;
        int [] result = new int[nums.length];
        int current = end;
        while (start<=end){

            if( Math.abs(nums[start] )< Math.abs(nums[end])){
                result[current] = nums[end] * nums[end];
                current --;
                end --;
            }else{
                result[current] = nums[start] * nums[start];
                current --;
                start ++;
            }

        }
        return result;

    }
}
