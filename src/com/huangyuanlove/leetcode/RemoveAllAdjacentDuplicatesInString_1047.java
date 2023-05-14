package com.huangyuanlove.leetcode;

public class RemoveAllAdjacentDuplicatesInString_1047 {
    public static void main(String[] args) {
        System.out.println(new RemoveAllAdjacentDuplicatesInString_1047().removeDuplicates("abbaca"));
    }

    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        char[]chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(sb.length()>0){
                if(sb.charAt(sb.length()-1) ==  chars[i]){
                   sb.deleteCharAt(sb.length()-1);
                }else{
                    sb.append(chars[i]);
                }


            }else{
                sb.append(chars[i]);
            }
        }
        return  sb.toString();

    }
}
