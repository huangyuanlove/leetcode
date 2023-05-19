package com.huangyuanlove.leetcode;

public class FindWordsThatCanBeFormedByCharacters_1160 {

    public static void main(String[] args) {

    }


    public int countCharacters(String[] words, String chars) {
        int charCount[] = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            charCount[chars.charAt(i) - 'a']++;
        }

        int result = 0;
        for (String s : words) {
            int sCharCount[] = new int[26];
            for (int i = 0; i < s.length(); i++) {
                sCharCount[s.charAt(i) - 'a']++;
            }
            boolean flag = true;
            for (int i = 0; i < 26; i++) {
                if (sCharCount[i] > charCount[i]) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                result += s.length();
            }
        }
        return result;
    }
}
