package com.huangyuanlove.leetcode;

public class ArrangingCoins_441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(1));
        System.out.println(arrangeCoins(2));
        System.out.println(arrangeCoins(3));
        System.out.println(arrangeCoins(1804289383));
    }

    public static  int arrangeCoins(int n) {


        return (int)Math.floor(( -1 + Math.sqrt(1.0+8.0*n))/2.0);

    }


}
