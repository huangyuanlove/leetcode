package com.huangyuanlove.leetcode;

public class CanPlaceFlowers_605 {
    public static void main(String[] args) {

    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        for (int i = 0; i < flowerbed.length; i++) {
            boolean left = false;
            boolean right =false;
            if(i-1<0 ){
                left = true;
            }else if(flowerbed[i-1] ==0){
                left = true;
            }
            if(i+1 == flowerbed.length){
                right = true;
            }else if(flowerbed[i+1] ==0){
                right = true;
            }
            if(left && right && flowerbed[i] ==0){
                n--;
                flowerbed[i] = 1;
            }


        }
        return n>0;


    }
}
