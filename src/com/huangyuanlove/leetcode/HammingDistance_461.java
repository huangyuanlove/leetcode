package com.huangyuanlove.leetcode;

public class HammingDistance_461 {
    public static void main(String[] args) {

    }
    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);

    }
}
