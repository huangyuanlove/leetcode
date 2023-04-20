package com.huangyuanlove.leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CountBinarySubstrings_696 {

    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("10101111"));
        System.out.println(countBinarySubstrings("001110011"));
        //define of key
        String key = "";
        //check key not null

    }

    public static int countBinarySubstrings(String s) {
    //统计连续相同的个数 然后相邻两个取较小求和
        //10101111   -> [1,1,1,1,4] -> [1,1,1,1]-> 4
        // 001110011 -> [2,3,2,2] ->[2,2,2] -> 6;
        ArrayList<Integer> count = new ArrayList<>();

        int current = 1;
        char pre = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == pre ){
                current ++;
            }else {
                count.add(current);
                current = 1;
                pre = s.charAt(i);
            }
        }
        count.add(current);
        int result = 0;

        for (int i = 0; i < count.size()-1; i++) {
            result+= Math.min(count.get(i),count.get(i+1));
        }
        return result;


    }
}
