package com.huangyuanlove.leetcode;

public class RansomNote_383 {
    public static void main(String[] args) {
        System.out.println(canConstruct("aba","ba"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
                char c = magazine.charAt(i);
                count[c-'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            count[c-'a']--;
            if(count[c-'a']<0){
                return false;
            }
        }
        return true;

    }
}
