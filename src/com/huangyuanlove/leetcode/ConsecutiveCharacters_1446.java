package com.huangyuanlove.leetcode;

public class ConsecutiveCharacters_1446 {
    public static void main(String[] args) {
        System.out.println(maxPower("leetcode"));
        System.out.println(maxPower("abbcccddddeeeeedcba"));
    }

    public static int maxPower(String s) {
        char[] chars = s.toCharArray();
        int count = 1;
        int max = count;
        char pre = chars[0];
        for (int i = 1; i < chars.length; i++) {
            if(chars[i] == pre){
                count++;
            }else{
                pre  = chars[i];
                max = Math.max(count,max);
                count = 1;
            }


        }
        return Math.max(count,max);

    }
}
