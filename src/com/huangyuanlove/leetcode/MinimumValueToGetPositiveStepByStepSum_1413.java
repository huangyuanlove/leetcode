package com.huangyuanlove.leetcode;

public class MinimumValueToGetPositiveStepByStepSum_1413 {
    public int minStartValue(int[] nums) {
        int sum = 0;
        int min = 0;
        for (int n : nums) {
            sum += n;
            min = Math.min(sum, min);
        }
        if (min > 0) {
            return 1;
        } else {
            return 1 - min;
        }

    }
}
