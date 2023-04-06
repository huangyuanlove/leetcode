package com.huangyuanlove.leetcode;

public class ReverseWordsInAString_iii_557 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
        System.out.println("s'teL ekat edoCteeL tsetnoc");
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (tmp.length() != 0) {
                    sb.append(tmp.reverse());
                    tmp.delete(0, tmp.length());
                }
                sb.append(' ');

            } else {
                tmp.append(s.charAt(i));
            }
        }
        if(tmp.length() >0){
            sb.append(tmp.reverse());
        }
        return sb .toString();
    }
}
