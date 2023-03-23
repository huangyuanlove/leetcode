package com.huangyuanlove.leetcode;

public class FirstUniqueCharacterInAString_387 {
    public static void main(String[] args) {

    }

    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}
