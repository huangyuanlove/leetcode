package com.huangyuanlove.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class RankTransformOfAnArray_1331 {



    public int[] arrayRankTransform(int[] arr) {
        int copy[] = new int[arr.length];
        System.arraycopy(arr,0,copy,0,arr.length);
        Arrays.sort(arr);
        HashMap<Integer,Integer> rank = new HashMap<>();
        for (int num :
                arr) {
            if (!rank.containsKey(num)){
                rank.put(num,rank.size()+1);
            }
        }
        int result[] = new int[arr.length];
        for (int i = 0; i < copy.length; i++) {
            result[i] = rank.get(copy[i]);
        }
        return result;
    }
}
