package com.huangyuanlove.leetcode;

public class FindTheDistanceValueBetweenTwoArrays_1385 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int result = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean add  =true;
            for (int j = 0; j < arr2.length; j++) {
                if(Math.abs(arr1[i] - arr2[j]) < d){
                   add = false;
                   break;
                }
            }
            if(add){
                result ++;
            }
        }
        return result;

    }
}
