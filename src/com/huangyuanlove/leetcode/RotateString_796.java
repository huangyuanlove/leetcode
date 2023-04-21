package com.huangyuanlove.leetcode;

public class RotateString_796 {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde","cdeab"));
    }
    public static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        if(s.equals(goal)){
            return true;
        }
        StringBuffer sb = new StringBuffer(s);
        sb.append(s);
        sb.deleteCharAt(s.length()*2-1);
        sb.deleteCharAt(0);
        System.out.println(sb.toString());
        return sb.toString().contains(goal);
    }
}
