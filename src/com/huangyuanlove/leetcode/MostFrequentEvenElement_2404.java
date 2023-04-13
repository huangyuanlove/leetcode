package com.huangyuanlove.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentEvenElement_2404 {

    public static void main(String[] args) {

    }

    /**
     * 给你一个整数数组 nums ，返回出现最频繁的偶数元素。
     *
     * 如果存在多个满足条件的元素，只需要返回 最小 的一个。如果不存在这样的元素，返回 -1 。
     * @param nums
     * @return
     */
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] %2 ==0){
                if(map.containsKey(nums[i])){
                    map.put(nums[i],map.get(nums[i])+1);
                }else{
                    map.put(nums[i],1);
                }

            }
        }

        if(map.size() ==0){
            return -1;
        }
        int min = -1;
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if(entry.getValue() >count){
                count = entry.getValue();
                min = entry.getKey();
            } else if (entry.getValue() == count) {
                if(entry.getKey() <min){
                    min = entry.getKey();
                }
            }

        }
        return min;

    }
}
