package com.huangyuanlove.leetcode;

public class RepeatedSubstringPattern_459 {
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abc"));
    }
    public  static boolean repeatedSubstringPattern(String s) {
            String result = s + s;
            result = result.substring(1,result.length()-1);
            return result.contains(s);
    }
}
