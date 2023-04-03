package com.huangyuanlove.leetcode;

import java.util.ArrayList;

public class PerfectNumber_507 {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
        System.out.println(checkPerfectNumber(5));
    }

    public static  boolean checkPerfectNumber(int num) {
        if(num == 1){
            return false;
        }
        int count = 1;
        for (int i = 2; i < num/2; i++) {
            int result = num/i;
            if(result *i ==num && result >=i){
                count+=result;
                count +=i;
                System.out.println(i +" " + result);
            }


        }
        return count == num;

    }
}
