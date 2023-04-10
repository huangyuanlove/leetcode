package com.huangyuanlove.leetcode;

import java.util.HashMap;

public class BinarySearch_704 {

    public static void main(String[] args) {
        System.out.println(search( new int[]{-1,0,3,5,9,12},2));
    }

    public  static int search(int[] nums, int target) {
        int result = -1;
        int start = 0;
        int end = nums.length-1;
        while (start < end){
            int middle = start +(end- start)/2;
            if(nums[middle] == target){
                result = middle;
                break;
            }else if(nums[middle] < target){
                start = middle +1;
            }else {
                end = middle -1;
            }


        }

        return result;



    }
}
