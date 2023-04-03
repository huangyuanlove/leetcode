package com.huangyuanlove.leetcode;

public class DetectCapital_520 {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("aB"));
    }
    public static boolean detectCapitalUse(String word) {
        if(word.length() == 1 ){
            return true;
        }
        int max = 0;
        int min = 0;
        int start =1;
        char first = word.charAt(0);
        if(first <='z' && first >='a'){
            max = 'z';
            min = 'a';
        }else{
            start =2;
            char tmp = word.charAt(1);
            if(tmp <='z' && tmp >='a'){
                max = 'z';
                min = 'a';
            }else {
                max ='Z';
                min ='A';
            }
        }

        boolean result = true;
        for (int i = start; i < word.length(); i++) {
            char c = word.charAt(i);
            if(c <=max && c >=min){

            }else{
                result = false;
                break;
            }

        }

        return result;
    }
}
