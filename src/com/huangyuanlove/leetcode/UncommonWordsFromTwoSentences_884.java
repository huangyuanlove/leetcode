package com.huangyuanlove.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UncommonWordsFromTwoSentences_884 {
    public static void main(String[] args) {

    }

    public String[] uncommonFromSentences(String s1, String s2) {
        String[] s1Split = s1.split(" ");
        String[] s2Split = s2.split(" ");
        HashMap<String,Integer> s1Map = new HashMap<>();
        for (int i = 0; i < s1Split.length; i++) {
            s1Map.put(s1Split[i],  s1Map.getOrDefault(s1Split[i],0)+1  );
        }
        for (int i = 0; i < s2Split.length; i++) {
            s1Map.put(s2Split[i],  s1Map.getOrDefault(s2Split[i],0)+1  );
        }

        ArrayList<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : s1Map.entrySet()) {
            if(entry.getValue() == 1){
                result.add(entry.getKey());
            }
        }
        return result.toArray(new String[0]);

    }
}
