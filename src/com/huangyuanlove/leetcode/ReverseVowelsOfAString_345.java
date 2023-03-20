package com.huangyuanlove.leetcode;

import java.util.Stack;

public class ReverseVowelsOfAString_345 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("race car"));
        System.out.println("race car");
    }

    public static boolean is(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                || (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                ;
    }

    public static String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        Stack<Character> stack = new Stack<>();
        int end = s.length()-1;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (is(current)) {
                if (i < end) {
                    while (i < end) {
                        char endC = s.charAt(end);
                        if (is(endC)) {
                            break;
                        } else {
                            end--;
                        }
                    }
                    if(i==end){
                        sb.append(s.charAt(end));
                    }else{
                        sb.append(s.charAt(end));
                        stack.push(current);
                    }
                    end --;
                } else {
                    if(i == end){
                        sb.append(current);
                    }else{
                        sb.append(stack.pop());
                    }
                }
            } else {
                sb.append(current);
            }
        }
        return sb.toString();
    }
}
