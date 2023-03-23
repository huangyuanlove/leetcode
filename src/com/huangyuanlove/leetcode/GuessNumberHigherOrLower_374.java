package com.huangyuanlove.leetcode;

public class GuessNumberHigherOrLower_374 {

    public static final int result = 1;
    
    public static void main(String[] args) {
        System.out.println(guessNumber(100));
    }

    public static int guessNumber(int n) {
        int min = 1;
        int max = n;
        while (min <= max){
            int mid = min +(max-min)/2;
            System.out.println(mid);
            int guessResult = guess(mid);
            if(guessResult == 0){
                return mid;
            }else if(guessResult >0){
                min = mid +1;
            }else {
                max = mid-1;
            }


        }
        return 0;

    }

   static  int guess(int num){
        if(num == result){
            return 0;
        } else if (num < result) {
            return 1;
        }else {
            return -1;
        }

   }
}
