package com.huangyuanlove.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueNumberOfOccurrences_1207 {

    public static void main(String[] args) {

    }

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int n :
                arr) {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        return map.size() == new HashSet<>(map.values()).size();

    }
}
