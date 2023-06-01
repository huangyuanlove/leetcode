package com.huangyuanlove.leetcode;

import java.util.Arrays;

public class MakeTwoArraysEqualByReversingSubarrays_1460 {
    public static void main(String[] args) {

    }
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < target.length; i++) {
            if(target[i]!=arr[i]){
                return false;
            }
        }
        return true;

    }
}
