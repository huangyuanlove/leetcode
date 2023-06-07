package com.huangyuanlove.leetcode;

import java.util.Arrays;

public class SpecialArrayWithXElementsGreaterThanOrEqualX_1608 {
    public static void main(String[] args) {


    }

    public int specialArray(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        if (nums[0] >= n) {
            return n;
        }
        for (int i = 1; i < n; i++) {
            if (nums[n - i] >= i && nums[n - 1 - i] < i) {
                return i;
            }
        }
        return -1;

    }
}
