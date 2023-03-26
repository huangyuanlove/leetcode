package com.huangyuanlove.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome_409 {
    public static void main(String[] args) {

    }
    public static int longestPalindrome(String s) {
        HashMap<Character,Integer> countMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            countMap.merge(c, 1, Integer::sum);
        }
        boolean needPushOne = false;
        int result = 0;
        for(Map.Entry<Character,Integer> entry : countMap.entrySet()){
            if(entry.getValue() %2== 1){
                needPushOne = true;
                result += entry.getValue()-1;
            }else{
                result += entry.getValue();
            }
        }
        if(needPushOne){
            result ++;
        }
        return result;


    }
}
