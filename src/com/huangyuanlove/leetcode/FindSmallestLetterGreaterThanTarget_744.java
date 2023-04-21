package com.huangyuanlove.leetcode;

public class FindSmallestLetterGreaterThanTarget_744 {
    public static void main(String[] args) {

    }
    public static char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            if(letters[i] > target){
                return letters[i];
            }
        }
        return letters[0];
    }
}
