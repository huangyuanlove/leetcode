package com.huangyuanlove.leetcode;

public class ReverseOnlyLetters_917 {

    public static void main(String[] args) {

    }
    public String reverseOnlyLetters(String s) {
        if(s.length() == 1){
            return s;
        }

        char sChars[] = s.toCharArray();
        int left = 0;
        int right = sChars.length-1;
        while(left < right){
            while(left < right && !Character.isLetter(sChars[left])){
                left++;
            }
            while(left < right && !Character.isLetter(sChars[right])){
                right--;
            }
            if(left < right){
                char temp = sChars[left];
                sChars[left] = sChars[right];
                sChars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(sChars);
    }
}
