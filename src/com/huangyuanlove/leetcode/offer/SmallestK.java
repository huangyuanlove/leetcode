package com.huangyuanlove.leetcode.offer;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

import java.util.Arrays;

public class SmallestK {
    public static void main(String[] args) {
        int result[] = smallestK(new int[]{6,1,2,3,4,5,6},3);
        ArrayListHelper.printList(result);

    }

    public static int[] smallestK(int[] arr, int k) {
        if(k>= arr.length){
            return arr;
        }
        if(k == 0){
            return  new int[0];
        }
        if(arr.length ==0){
            return  new int[0];
        }
        Arrays.sort(arr);
        return Arrays.copyOfRange(arr,0,k);



    }
}
