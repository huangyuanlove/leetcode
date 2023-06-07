package com.huangyuanlove.leetcode;

public class XorOperationInAnArray_1486 {
    public static void main(String[] args) {

        System.out.println(xorOperation(5,0));
    }


    public static int xorOperation(int n, int start) {

        int result = start;
        for (int i = 1; i < n; i++) {
            int current = start + 2*i;
            System.out.println(current);
            result ^= current;

        }
        return result;

    }
}
