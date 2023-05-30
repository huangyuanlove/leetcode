package com.huangyuanlove.leetcode;

import java.util.Arrays;

public class IncreasingDecreasingString_1370 {
    public static void main(String[] args) {
        System.out.println(sortString("aaaabbbbcccc"));
        System.out.println("abccbaabccba");
    }

    public static String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        StringBuilder sb = new StringBuilder();
        char pre = '0';
        boolean findSmall = false;
        while (sb.length() < chars.length){
            boolean find = false;
            if(findSmall){
                //找最小的
                for (int i = 0; i < chars.length; i++) {
                    char current = chars[i];
                    if(current >='a' && current <='z'){
                        if(current > pre){
                            pre = current;
                            sb.append(current);
                            chars[i] = 'a'-1;
                            find = true;
                        }
                    }
                }

            }else{
                //找最大的
                for (int i = chars.length-1; i >=0 ; i--) {
                    char current = chars[i];
                    if(current >='a' && current <='z'){
                        if(current < pre){
                            pre = current;
                            sb.append(current);
                            chars[i] = 'a'-1;
                            find = true;
                        }
                    }
                }
            }
            if(!find){

                if(findSmall){
                    pre = 'z'+1;
                }else{
                    pre = 'a'-1;
                }
                findSmall = !findSmall;


            }



        }
        return  sb.toString();

    }
}
