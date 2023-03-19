package com.huangyuanlove.leetcode;

public class PowerOfThree_326 {

    public static void main(String[] args) {


    }

    public boolean isPowerOfThree(int n) {
        //范围内最大的3的次幂为1162261467
        return n > 0 && 1162261467%n == 0;
    }
}
