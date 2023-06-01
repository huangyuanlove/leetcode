package com.huangyuanlove.leetcode;

public class ThreeConsecutiveOdds_1550 {

    public static void main(String[] args) {

    }

    public boolean threeConsecutiveOdds(int[] arr) {

        int count = 0;
        for (int n :
                arr) {
            if( (n&1)==1){
                count ++;
                if(count ==3){
                    return true;
                }
            }else{
                count = 0;
            }
        }
        return false;

    }
}
