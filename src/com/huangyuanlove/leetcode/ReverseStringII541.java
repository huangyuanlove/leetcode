package com.huangyuanlove.leetcode;

public class ReverseStringII541 {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg",8));
    }


    public static String reverseStr(String s, int k) {
        if (s.length() <= k) {
           return new StringBuilder(s).reverse().toString();
        }

        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean revers = true;
        while (i < s.length()) {
            int max = i + k-1;
            if (i + k >= s.length()) {
                max = s.length()-1;
            }
            if (revers) {
                for (int j = max; j >= i; j--) {

                    sb.append(s.charAt(j));
                }
                revers = false;
            } else {
                for (int j = i; j <= max; j++) {

                    sb.append(s.charAt(j));
                }
                revers = true;
            }
            i += k;

        }

        return sb.toString();
    }
}
