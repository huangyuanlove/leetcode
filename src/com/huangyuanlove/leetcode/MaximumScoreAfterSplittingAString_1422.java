package com.huangyuanlove.leetcode;

public class MaximumScoreAfterSplittingAString_1422 {
    public static void main(String[] args) {

        System.out.println(maxScore("011101"));
        System.out.println(maxScore("010101"));
        System.out.println(maxScore("000000"));
        System.out.println(maxScore("0010010"));
        /**
         * 5
         * 4
         * 5
         * 5
         */
    }
    public static int maxScore(String s) {
        //010101
        char[] chars = s.toCharArray();
        int result = 0;
        if(chars[0] == '0'){
            result++;
        }
        if(chars[chars.length-1] =='1'){
            result ++;
        }

        for (int i = 1; i < chars.length-1; i++) {
                if(chars[i] =='1'){
                    result ++;
                }
        }
        int max = result;
        for (int i = 1; i < chars.length-1; i++) {
            if(chars[i] =='1'){
                result --;
            }else{
                result ++;
            }
            max = Math.max(result,max);
        }
        return max ;
    }
}
