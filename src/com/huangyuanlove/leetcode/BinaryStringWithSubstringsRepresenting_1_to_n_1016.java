package com.huangyuanlove.leetcode;

public class BinaryStringWithSubstringsRepresenting_1_to_n_1016 {
    public static void main(String[] args) {

    }
    public boolean queryString(String s, int n) {
        if(n > 2048){
            return false;
        }
        boolean result = true;
        for (int i = 1; i <= n; i++) {
            if(s.contains(Integer.toBinaryString(i))){
                continue;
            }else{
                result  = false;
            }
        }

        return result;

    }
}
