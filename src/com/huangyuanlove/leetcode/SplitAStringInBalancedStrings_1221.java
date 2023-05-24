package com.huangyuanlove.leetcode;

public class SplitAStringInBalancedStrings_1221 {
    public static void main(String[] args) {

    }
    public int balancedStringSplit(String s) {
        int rCount = 0;
        int lCount = 0;
        int result = 0;
        char[]chars = s.toCharArray();
        for (char c : chars) {
            if(c =='R'){
                rCount ++;
            }else {
                lCount ++;
            }

            if(rCount == lCount){
                result++;
                rCount = 0;
                lCount  =0;
            }


        }
        return result;

    }
}
