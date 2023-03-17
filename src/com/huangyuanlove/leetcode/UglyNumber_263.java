package com.huangyuanlove.leetcode;

public class UglyNumber_263 {

    public static void main(String[] args) {
        System.out.println(isUgly(1));
        System.out.println( -1%2);
    }

    public static boolean isUgly(int n) {
        if(n<1){
            return false;
        }

        while (n!=1){
            boolean goon = false;
            if(n%2 ==0){
                n = n/2;
                goon = true;
            }
            if(n%3 == 0){
                n = n/3;
                goon = true;
            }
            if(n % 5==0){
                n = n/5;
                goon = true;
            }
            if(!goon){
                return false;
            }


        }

        return true;
    }
}
