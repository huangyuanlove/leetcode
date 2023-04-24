package com.huangyuanlove.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MostCommonWord_819 {
    public static void main(String[] args) {
        new MostCommonWord_819().mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",new String[]{"hit"});
    }
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        HashMap<String,Integer> map = new HashMap<>();
        paragraph = paragraph.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char c : paragraph.toCharArray()) {
            if (isChar(c)){
                sb.append(c);
            }else{
                if(sb.length()>0){
                    String tmp = sb.toString();

                    sb.delete(0,sb.length());
                    if(!bannedSet.contains(tmp)){
                        map.put(tmp,map.getOrDefault(tmp,0)+1);
                    }
                }
            }
        }
        if(sb.length()>0){
            String tmp = sb.toString();

            sb.delete(0,sb.length());
            if(!bannedSet.contains(tmp)){
                map.put(tmp,map.getOrDefault(tmp,0)+1);
            }
        }
        int maxCount = 0;
        String result = null;
        for (Map.Entry<String, Integer> entry :
                map.entrySet()) {
         if(entry.getValue() > maxCount){
             maxCount = entry.getValue();
             result = entry.getKey();
         }
        }
        return result;
    }

    public boolean isChar(char c){
        return c <= 'z' && c >= 'a' ;
    }
}
