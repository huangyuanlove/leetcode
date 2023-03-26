package com.huangyuanlove.leetcode;

public class IsSubsequence_392 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("axc","ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        if(s.length() > t.length()){
            return false;
        }
        int sIndex =0;
        int tIndex = 0;
        while (sIndex < s.length() && tIndex < t.length()){
             char sChar = s.charAt(sIndex);
             char tChar = t.charAt(tIndex);
             if(sChar == tChar){
                 sIndex ++;
             }
             tIndex ++;
        }

        if(sIndex == s.length()){
            return true;
        }else{
            return false;
        }




    }
}
