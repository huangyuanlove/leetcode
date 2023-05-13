package com.huangyuanlove.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class LargestPositiveIntegerThatExistsWithItsNegative_2441 {
    public static void main(String[] args) {

    }

    public int findMaxK(int[] nums) {
        int result = -1;
       HashSet<Integer> set = new HashSet<>();
        for (int n :
                nums) {
            if (set.contains(-n)) {
                if(Math.abs(n) > result ){
                    result = Math.abs(n);
                }
            }else{
                set.add(n);
            }
        }
        return result;

    }
}
