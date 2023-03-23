package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.ToIntFunction;

public class IntersectionOfTwoArraysII_350 {

    public static void main(String[] args) {
        int result[] = intersect(new int[]{1,2,2,1},new int[]{2,2});
        ArrayListHelper.printList(result);
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> first = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if(first.containsKey(nums1[i])){
                first.put(nums1[i],first.get(nums1[i])+1);
            }else{
                first.put(nums1[i],1);
            }
        }
        HashMap<Integer,Integer> second = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            if(second.containsKey(nums2[i])){
                second.put(nums2[i],second.get(nums2[i])+1);
            }else{
                second.put(nums2[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : first.entrySet()){
            int value = entry.getKey();
            int count = entry.getValue();
            if(second.containsKey(value)){
                int sCount = second.get(value);
                int rCount = Math.min(count,sCount);
                for (int i = 0; i < rCount; i++) {
                    result.add(value);
                }

            }


        }

        return result.stream().mapToInt(new ToIntFunction<Integer>() {
            @Override
            public int applyAsInt(Integer integer) {
                return integer.intValue();
            }
        }).toArray();

    }
}
