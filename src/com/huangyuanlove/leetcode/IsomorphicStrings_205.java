package com.huangyuanlove.leetcode;

import java.util.HashMap;

public class IsomorphicStrings_205 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg",
                "add"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character,Character> revert = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character sChar = s.charAt(i);
            Character tChar = t.charAt(i);
            if(map.containsKey(sChar)){
                Character tmp = map.get(sChar);
                if(tmp != tChar){
                    return false;
                }
            }else{

                if(revert.containsKey(tChar)){
                    return  false;
                }
                revert.put(tChar,sChar);
                map.put(sChar,tChar);
            }
        }
        return true;

    }
}
