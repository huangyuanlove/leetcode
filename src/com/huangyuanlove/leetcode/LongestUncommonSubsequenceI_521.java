package com.huangyuanlove.leetcode;

public class LongestUncommonSubsequenceI_521 {
    public static void main(String[] args) {

    }

    public static int findLUSlength(String a, String b) {
            if(a.equals(b)){
                return -1;
            }
            return Math.max(a.length(),b.length());
    }
}
