package com.huangyuanlove.leetcode;

public class ElementAppearingMoreThan25InSortedArray_1287 {
    public static void main(String[] args) {
        int testCase[] = new int[]{1,2,2,6,6,6,6,7,10};
    }

    public int findSpecialInteger(int[] arr) {
        double count = arr.length *0.25;
        int nCount = 0;
        int number = -1;
        for (int i = 0; i < arr.length; i++) {
            if(number <0){
                number = arr[i];
                nCount =1;
            }else{
                if(number == arr[i]){
                    nCount ++;
                }else{
                    number = arr[i];
                    nCount =1;
                }
            }

            if(nCount > count){
                return number;
            }
        }
        return -1;
    }
}
