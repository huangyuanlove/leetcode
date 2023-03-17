package com.huangyuanlove.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram_242 {

    public static void main(String[] args) {

    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            map.put(c,(map.get(c)==null?1:map.get(c) + 1));
        }
        for (int i = 0; i < t.length(); i++) {
            Character c = t.charAt(i);
            map.put(c,(map.get(c) - 1));
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()!=0){
                return false;
            }
        }

        return true;


    }
}
