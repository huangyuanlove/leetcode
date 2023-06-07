package com.huangyuanlove.leetcode;

import java.util.ArrayList;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class DecompressRunLengthEncodedList_1313 {
    public static void main(String[] args) {

    }

    public int[] decompressRLElist(int[] nums) {

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {

            for (int j = 0; j < nums[i]; j++) {
                result.add(nums[i + 1]);
            }


        }

        return result.stream().mapToInt(new ToIntFunction<Integer>() {
            @Override
            public int applyAsInt(Integer value) {
                return value;
            }
        }).toArray();


    }
}
