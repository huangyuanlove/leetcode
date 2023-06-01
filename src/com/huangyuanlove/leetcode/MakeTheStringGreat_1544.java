package com.huangyuanlove.leetcode;

import java.util.Stack;

public class MakeTheStringGreat_1544 {
    public static void main(String[] args) {
        System.out.println('a'-0);
        System.out.println('A'-0);
    }

    public String makeGood(String s) {

        char[]chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = chars.length-1; i >=0; i--) {

            if(stack.isEmpty()){
                stack.push(chars[i]);
            }else{

                if(chars[i] <='z' && chars[i]>='a'){
                    if(chars[i] - 32 == stack.peek() ){
                        stack.pop();
                    }else{
                        stack.push(chars[i]);
                    }

                }else{
                    if(chars[i] + 32 == stack.peek()){
                        stack.pop();
                    }else{
                        stack.push(chars[i]);
                    }
                }

            }

        }

        if(stack.isEmpty()){
            return "";
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();


    }
}
