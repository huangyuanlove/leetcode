package com.huangyuanlove.leetcode.contest;

import java.util.HashSet;

public class CheckIfTheNumberIsFascinating_6461 {
    public static void main(String[] args) {
        System.out.println(isFascinating(192));
    }
    public static boolean isFascinating(int n) {
        if(n>333){
            return false;
        }
        int n2 = n *2;
        int n3 = n *3;
        StringBuilder sb = new StringBuilder();
        sb.append(n).append(n2).append(n3);
        char chars[] = sb.toString().toCharArray();
        HashSet<Character> characters = new HashSet<>();
        for(char c : chars){
            if(c =='0'){
                return false;
            }
            if(!characters.add(c)){
                return false;
            }

        }
        return characters.size() ==9;


    }
}
