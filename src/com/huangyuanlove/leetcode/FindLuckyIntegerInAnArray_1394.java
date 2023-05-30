package com.huangyuanlove.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

public class FindLuckyIntegerInAnArray_1394 {

    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1 );
        }
        int max = -1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(Objects.equals(entry.getKey(), entry.getValue())){
                max = Math.max(max,entry.getKey());
            }
        }
        return max;

    }
}
