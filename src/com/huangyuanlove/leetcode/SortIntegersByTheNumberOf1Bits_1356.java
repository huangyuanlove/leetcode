package com.huangyuanlove.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class SortIntegersByTheNumberOf1Bits_1356 {
    public static void main(String[] args) {

    }

    public int[] sortByBits(int[] arr) {
        Pair[] pairs = new Pair[arr.length];
        for (int i = 0; i < arr.length; i++) {
            Pair pair = new Pair();
            pair.num = arr[i];
            pair.bitCount = Integer.bitCount(arr[i]);
            pairs[i] = pair;
        }
        Arrays.sort(pairs, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
               int diff = o1.bitCount - o2.bitCount;
               if(diff ==0){
                   return o1.num - o2.num;
               }
               return diff;
            }
        });
        int result[] = new int[arr.length];
        for (int i = 0; i < pairs.length; i++) {
            result[i] = pairs[i].num;
        }
        return result;



    }

    class Pair{
        int num;
        int bitCount;
    }
}
