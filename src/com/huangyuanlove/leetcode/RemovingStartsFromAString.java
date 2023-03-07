package com.huangyuanlove.leetcode;

public class RemovingStartsFromAString {

    public static void main(String ...args){
        System.out.println(removeStars("leet**cod*e"));
    }
    public static String removeStars(String s) {
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '*'){
                if(stringBuffer.length()>0){
                    stringBuffer.deleteCharAt(stringBuffer.length()-1);
                }
            }else{
                stringBuffer.append(c);
            }
        }
        return stringBuffer.toString();
    }
}
