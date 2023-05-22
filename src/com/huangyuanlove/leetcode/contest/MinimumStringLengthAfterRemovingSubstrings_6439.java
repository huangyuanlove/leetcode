package com.huangyuanlove.leetcode.contest;

import java.util.ArrayList;

public class MinimumStringLengthAfterRemovingSubstrings_6439 {
    public static void main(String[] args) {
        System.out.println(minLength("ABFCACDB"));
        System.out.println(minLength("ACBBD"));
    }

    public static int minLength(String s) {

        ArrayList<Character> list = new ArrayList<>();
        char[] sChars = s.toCharArray();
        for (int i = 0; i < sChars.length; i++) {
            if(list.isEmpty()){
                list.add(sChars[i]);
            }else{
                if(sChars[i] =='B'){
                    if(list.get(list.size()-1) =='A'){
                        list.remove(list.size()-1);
                    }else{
                        list.add(sChars[i]);
                    }
                }else if(sChars[i] == 'D'){
                    if(list.get(list.size()-1) =='C'){
                        list.remove(list.size()-1);
                    }else{
                        list.add(sChars[i]);
                    }
                }else{
                    list.add(sChars[i]);
                }
            }
        }
        return list.size();


    }
}
