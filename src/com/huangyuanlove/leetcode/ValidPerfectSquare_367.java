package com.huangyuanlove.leetcode;

public class ValidPerfectSquare_367 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(5));
//        for (int i = 1; i < 10; i++) {
//            int check = (1 + 2*i-1) * i / 2;
//            System.out.println(check + "   " +isPerfectSquare(check));
//        }
    }

    public static boolean isPerfectSquare(int num) {

       int min = 1;
       int max =  num ;
        while (min <= max){
            int mid = (min + max)/2;
            int result = num / mid;
            if(result == mid){
                if(num % mid ==0){
                    return true;
                }
                min = mid+1;
            }
            if(num / mid < mid){
                max = mid-1;
            }else{
                min = mid+1;
            }
        }


        return false;
    }
}
