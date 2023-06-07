package com.huangyuanlove.leetcode;

public class ConvertIntegerToTheSumOfTwoNoZeroIntegers_1317 {
    public static void main(String[] args) {

    }

    public int[] getNoZeroIntegers(int n) {

        int i = 1;
        int j = n -1;
        while (true){
            if( !String.valueOf(i).contains("0") && !String.valueOf(j).contains("0") ){
                break;
            }
            j--;
            i++;
        }
        return  new int[]{i,j};


    }
}
