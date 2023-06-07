package com.huangyuanlove.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSubsequenceInNonIncreasingOrder_1403 {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i : nums){
            sum +=i;
        }
        ArrayList<Integer> integers = new ArrayList<>();
        int tmp = 0;
        for (int i = nums.length-1; i > -1; i--) {
            integers.add(nums[i]);
            tmp += nums[i];
            if(tmp > sum /2){
                break;
            }

        }
        return integers;

    }
}
