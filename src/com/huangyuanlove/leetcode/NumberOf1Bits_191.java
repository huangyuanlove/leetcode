package com.huangyuanlove.leetcode;

public class NumberOf1Bits_191 {
    public static void main(String[] args) {
        for (int i = 0; i < 10000000; i++) {
            boolean result = Integer.bitCount(i) == hammingWeight(i);
            if(!result){
                System.out.println("error");
                break;
            }else{
                System.out.println("--");
            }
        }
    }
    public static int hammingWeight(int n) {
//        return Integer.bitCount(n);
        int count = 0;
        while (n!=0){
            n= n&(n-1);
            count ++;
        }
        return count;
    }

}
