package com.huangyuanlove.leetcode;

public class Maximum69Number_1323 {

    public static void main(String[] args) {

        System.out.println(maximum69Number(9996));
        System.out.println(maximum69Number(9669));
        System.out.println(maximum69Number(9996));

    }

    public static int maximum69Number(int num) {
        String s = String.valueOf(num);

        int index = s.indexOf('6');
        if (index < 0) {
            return num;
        } else {

            return num + (int) Math.pow(10, s.length() - index - 1) * 3;

        }


    }
}
