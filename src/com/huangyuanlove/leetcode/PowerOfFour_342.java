package com.huangyuanlove.leetcode;

public class PowerOfFour_342 {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(13));
    }

    public static boolean isPowerOfFour(int n) {
        if (n < 0 || (n & (n - 1)) != 0) {//check(is or not) a power of 2.
            return false;
        }
        return n % 3 == 1;
    }
}
