package com.huangyuanlove.leetcode;

public class FindNumbersWithEvenNumberOfDigits_1295 {
    public static void main(String[] args) {

    }

    public int findNumbers(int[] nums) {
        int result = 0;
        for (int n : nums) {

            if(n>9 && n <100){
                result++;
            }else if (n >999 && n < 10000){
                result ++;
            }else if( n > 99999 && n < 1000000){
                result++;
            }

        }
        return result;

    }
}
