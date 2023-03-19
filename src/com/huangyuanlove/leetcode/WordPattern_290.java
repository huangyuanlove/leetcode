package com.huangyuanlove.leetcode;

import java.util.HashMap;

public class WordPattern_290 {
    public static void main(String[] args) {

    }
    public static boolean wordPattern(String pattern, String s) {
        String[] split = s.split(" ");
        if(pattern.length() != split.length){
            return false;
        }

        HashMap<Character,String> map = new HashMap<>();
        HashMap<String,Character> revers = new HashMap<>();

        for (int i = 0; i <pattern.length(); i++) {
            Character c  = pattern.charAt(i);
            if(map.containsKey(c)){
                 String tmp = map.get(c);
                 if(split[i].equals(tmp)){

                 }else{
                     return false;
                 }
            }else{
                Character cTmp = revers.get(split[i]);
                if(cTmp ==null){

                }else{
                    return false;
                }

            }
            map.put(c,split[i]);
            revers.put(split[i],c);


        }





        return true;
    }
}
