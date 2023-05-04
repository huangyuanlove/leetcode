package com.huangyuanlove.leetcode;

import java.util.HashSet;

public class NRepeatedElementInSize2nArray_961 {
    public static void main(String[] args) {
        System.out.println(new NRepeatedElementInSize2nArray_961().repeatedNTimes(new int[]{5, 1, 5, 2, 5, 3, 5, 4}));
    }

    public int repeatedNTimes(int[] nums) {

        HashSet<Integer> set = new HashSet<>(nums.length / 2 + 1);
        for (int n : nums) {
            if (!set.add(n)) {
                return n;
            }
        }

        return -1;

    }
}
