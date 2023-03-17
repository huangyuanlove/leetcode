package com.huangyuanlove.leetcode;

public class AddDigits_258 {

    public static void main(String[] args) {
        System.out.println( addDigits(38));

    }

    public static int addDigits(int num) {
        while (num >9){
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num =sum;
        }
        return num;
    }
}
