package com.huangyuanlove.leetcode;

public class NThTribonacciNumber_1137 {
    public static void main(String[] args) {
        System.out.println(new NThTribonacciNumber_1137().tribonacci(4));
        System.out.println(new NThTribonacciNumber_1137().tribonacci(5));
        System.out.println(new NThTribonacciNumber_1137().tribonacci(6));
    }
    public int tribonacci(int n) {
        int n0 = 0;
        int n1 = 1;
        int n2 =1;
        int result = 0;
        if(n ==0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        for (int i = 3; i <= n; i++) {
            result = n0+n1+n2;
            n0 =n1;
            n1 = n2;
            n2 = result;
        }
        return result;


    }
}
