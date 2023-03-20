package com.huangyuanlove.leetcode;

public class ReverseString_344 {
    public static void main(String[] args) {
        reverseString(new char[]{'1','2','3','4','5','6','7'});
    }

    public static void reverseString(char[] s) {
        if (s == null || s.length <= 1) {
            return;
        }
        int start = 0;
        int end = s.length - 1;

        while (start < end) {

            char tmp = s[start];
            s[start] = s[end];
            s[end] = tmp;

            start++;
            end--;
        }


        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }

    }



}
