package com.huangyuanlove.leetcode;

import java.util.ArrayList;

public class ReformatTheString_1417 {
    public static void main(String[] args) {

    }
    public String reformat(String s) {

        char[] chars = s.toCharArray();
        ArrayList<Character> characters = new ArrayList<>();
        ArrayList<Character> nums = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if( chars[i]>='a' && chars[i] <='z' ){
                characters.add(chars[i]);
            }else{
                nums.add(chars[i]);
            }
        }
        if(Math.abs(characters.size() - nums.size())>1){
            return "";
        }else{
            StringBuilder stringBuffer = new StringBuilder();

            boolean cStart = false;
            if(characters.size() > nums.size()){
                //先拼接c
                cStart = true;
            }
            for (int i = 0; i < characters.size() && i < nums.size(); i++) {
                if(cStart){
                    stringBuffer.append(characters.get(i)).append(nums.get(i));
                }else{
                    stringBuffer.append(nums.get(i)).append(characters.get(i));
                }
            }
            if(characters.size() > nums.size()){
                stringBuffer.append(characters.get(characters.size()-1));
            }else if(characters.size() < nums.size()){
                stringBuffer.append(nums.get(nums.size()-1));
            }


            return stringBuffer.toString();
        }

    }
}
