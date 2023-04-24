package com.huangyuanlove.leetcode;

public class BackspaceStringCompare_844 {
    public static void main(String[] args) {

    }

    public boolean backspaceCompare(String s, String t) {
        StringBuilder S = new StringBuilder();
        StringBuilder T = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != '#'){
                S.append(s.charAt(i));
            }else{
                if(S.length()!=0){
                    S.delete(S.length()-1,S.length());
                }
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if(t.charAt(i) != '#'){
                T.append(t.charAt(i));
            }else{
                if(T.length()!=0){
                    T.delete(T.length()-1,T.length());
                }
            }
        }
        return S.toString().equals(T.toString());


    }
}
