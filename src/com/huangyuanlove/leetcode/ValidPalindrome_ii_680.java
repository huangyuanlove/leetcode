package com.huangyuanlove.leetcode;

public class ValidPalindrome_ii_680 {
    public static void main(String[] args) {
        System.out.println(validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
        System.out.println(validPalindrome("abc"));
    }

    public static boolean validPalindrome(String s) {
        if (s.length() <= 2) {
            return true;
        }
        boolean result  = true;
        boolean delete = false;
        int start = 0;
        int end = s.length() -1;
        //先尝试删除左边的
        while (start < end){
            if(s.charAt(start) == s.charAt(end)){
                start ++;
                end --;
            }else {
                if(delete){
                    result = false;
                    break;
                }
                delete = true;
                start ++;

            }
        }

        if(!result){
            delete = false;
            start = 0;
            result = true;
            end = s.length() -1;
            while (start < end){
                if(s.charAt(start) == s.charAt(end)){
                    start ++;
                    end --;
                }else {
                    if(delete){
                        result = false;
                        break;
                    }
                    delete = true;
                    end --;
                }
            }
        }

        return result;

    }
}
