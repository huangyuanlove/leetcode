package com.huangyuanlove.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToIntFunction;

public class IntersectionOfTwoArrays_249 {
    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {

        Object object = new Object();

        HashMap<Integer,Object> hashMap = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            hashMap.put(nums1[i],object);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if(hashMap.containsKey(nums2[i]) && !result.contains(nums2[i])){
                result.add(nums2[i]);
            }
        }



        return result.stream().mapToInt(new ToIntFunction<Integer>() {
            @Override
            public int applyAsInt(Integer value) {
                return value.intValue();
            }
        }).toArray();

    }
}
