package com.huangyuanlove.leetcode;

import java.util.HashSet;

public class HappyNumber_202 {
    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();
        while (true){
            int current = 0;
            while (n > 0) {
                current += (n % 10) * (n % 10);
                n /= 10;
            }
            if(current == 1){
                return true;
            }else {
                boolean result = set.add(current);
                if(!result){
                    return false;
                }
            }
            n = current;
        }




    }
}
