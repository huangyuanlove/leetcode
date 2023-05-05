package com.huangyuanlove.leetcode;

import java.util.Arrays;

public class LargestPerimeterTriangle_976 {
    public static void main(String[] args) {
        System.out.println(new LargestPerimeterTriangle_976().largestPerimeter(new int[]{2,1,1}));
    }

    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length-1; i >=2 ; i--) {

            if(nums[i] + nums[i-1] > nums[i-2]  && nums[i-1] + nums[i-2] > nums[i] && nums[i-2] + nums[i] > nums[i-1]){
                return nums[i] + nums[i-1] + nums[i-2];
            }


        }
        return 0;

    }
}
