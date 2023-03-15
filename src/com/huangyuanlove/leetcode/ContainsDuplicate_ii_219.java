package com.huangyuanlove.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class ContainsDuplicate_ii_219 {

    public static void main(String[] args) {

        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3},2));
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1},3));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 1){
            return false;
        }
        if(k==0){
            return false;
        }
        HashMap<Integer, Object> map = new HashMap<>();
        for (int i = 0;i<k && i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i],null);
            }
        }
        for(int i = k; i<nums.length ;i++){
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.remove(nums[i-k]);
                map.put(nums[i],null);

            }
        }

        return false;

    }
}
