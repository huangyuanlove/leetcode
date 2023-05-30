package com.huangyuanlove.leetcode;

import java.util.ArrayList;
import java.util.function.ToIntFunction;

public class CreateTargetArrayInTheGivenOrder_1389 {
    public static void main(String[] args) {

    }

    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            result.add(index[i],nums[i]);

        }

      return   result.stream().mapToInt(new ToIntFunction<Integer>() {
            @Override
            public int applyAsInt(Integer value) {
                return value;
            }
        }).toArray();


    }
}
