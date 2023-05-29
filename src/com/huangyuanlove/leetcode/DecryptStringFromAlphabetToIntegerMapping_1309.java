package com.huangyuanlove.leetcode;

public class DecryptStringFromAlphabetToIntegerMapping_1309 {
    public static void main(String[] args) {

        System.out.println(freqAlphabets("10#11#12"));

    }

    public static  String freqAlphabets(String s) {
        char[] charTables = new char[]{'-','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] chars = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        int index = 0;
        while (index < chars.length){
            int current = chars[index] -'0';
            if(index +2 < chars.length && chars[index +2]=='#'){
                int next = chars[index+1] - '0';
                sb.append(charTables[current*10 + next]);
                index +=3;

            }else{
                sb.append(charTables[current]);
                index ++;
            }
        }
        return sb.toString();
    }
}
