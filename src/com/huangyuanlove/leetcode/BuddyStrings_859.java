package com.huangyuanlove.leetcode;

import java.util.HashSet;

public class BuddyStrings_859 {

    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        if(s.length()  ==1){
            return false;
        }
        if(s.equals(goal)){
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                if(!set.add(s.charAt(i))){
                    return true;
                }
            }
            return false;
        }


        int sF = -1;
        int sS =  -1;


        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != goal.charAt(i)){
                if(sF!=-1){
                    if(sS!=-1){
                        return false;
                    }else {
                        sS = i;
                    }
                }else{
                    sF = i;
                }
            }
        }


        if(sF != -1 && sS ==-1){
            return false;
        }

        return s.charAt(sF) == goal.charAt(sS) && s.charAt(sS)==goal.charAt(sF);


    }

}
