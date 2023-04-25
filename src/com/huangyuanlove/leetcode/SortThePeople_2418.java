package com.huangyuanlove.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortThePeople_2418 {
    public static void main(String[] args) {

    }

    public static String[] sortPeople(String[] names, int[] heights) {
        String[] result = new String[names.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < heights.length; i++) {
            map.put(heights[i],i);
        }

        for (int i = 0; i < heights.length; i++) {
            result[heights.length -i-1] = names[map.get(heights[i])];
        }
        return result;
    }

}

