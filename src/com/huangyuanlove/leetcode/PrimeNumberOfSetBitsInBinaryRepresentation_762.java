package com.huangyuanlove.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class PrimeNumberOfSetBitsInBinaryRepresentation_762 {

    public static void main(String[] args) {

    }

    public int countPrimeSetBits(int left, int right) {
        HashSet<Integer> set = new HashSet<>();
        int[] tmp = new int[]{2,3,5,7,11,13,17,19,23,29, 31};
        for (int i = 0; i < tmp.length; i++) {
            set.add(tmp[i]);
        }
        int count = 0;
        for (int i = left; i <=right ; i++) {
            int bitCount = Integer.bitCount(i);
            if(set.contains(bitCount)){
                count ++;
            }
        }
        return  count;


    }
}
