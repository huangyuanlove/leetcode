package com.huangyuanlove.leetcode.contest;

public class LexicographicallySmallestPalindrome_6454 {

    public static void main(String[] args) {
        System.out.println(makeSmallestPalindrome("egcfe"));
        System.out.println(makeSmallestPalindrome("abcd"));
        System.out.println(makeSmallestPalindrome("seven"));
    }


    public static String makeSmallestPalindrome(String s) {

        char[]sChars = s.toCharArray();
        int start = 0;
        int end = sChars.length -1;
        while (start < end){
            if(sChars[start] != sChars[end]){
                if(sChars[start] < sChars[end]){
                     sChars[end] = sChars[start];
                }else{
                    sChars[start] = sChars[end];
                }
            }
            start ++;
            end --;
        }
        return new String(sChars);

    }
}
