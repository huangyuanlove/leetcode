package com.huangyuanlove.leetcode;

public class PowerOfTwo_231 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(10));

    }
    public static boolean isPowerOfTwo(int n) {



        for (int i = 0; i < n; i++) {
            double  result = Math.pow(2,i);
            if(result ==n){
                return true;
            }else{
                if(result <n){
                    continue;
                }else{
                    return false;
                }
            }

        }
        return false;
    }
}
