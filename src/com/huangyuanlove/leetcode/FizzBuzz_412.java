package com.huangyuanlove.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz_412 {
    public static void main(String[] args) {

    }

    public static List<String> fizzBuzz(int n) {
        ArrayList<String> result = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if(i%3 == 0 && i %5==0){
                result.add("FizzBuzz");
            }else if(i%3 ==0){
                result.add("Fizz");
            }else if(i%5==0){
                result.add("Buzz");
            }else{
                result.add(String.valueOf(i));
            }

        }
        return result;

    }
}
