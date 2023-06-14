package com.huangyuanlove.leetcode.contest;

import java.util.ArrayList;

public class FindTheLongestSemiRepetitiveSubstring_6425 {
    public static void main(String[] args) {
        System.out.println(longestSemiRepetitiveSubstring("52233"));
        System.out.println(longestSemiRepetitiveSubstring("52233123"));
        System.out.println(longestSemiRepetitiveSubstring("1111111"));
        System.out.println(longestSemiRepetitiveSubstring("5494"));
    }

    public static int longestSemiRepetitiveSubstring(String s) {
//        "52233"
        char[]chars = s.toCharArray();
        int max = 0;
        int current = 1;
        boolean has = false;
        int pre = 0;
        for (int i = 1; i < chars.length; i++) {
            if(chars[i] != chars[i-1]){
                current ++;
            }else{
                if(has){
                    has = false;
                    max = Math.max(max,current);
                    current =1;
                    i=pre;


                }else{
                    has = true;
                    current ++;
                    pre = i;
                }
            }

        }
        return Math.max(current,max);

    }
}
