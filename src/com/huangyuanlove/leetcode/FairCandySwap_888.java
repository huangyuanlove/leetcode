package com.huangyuanlove.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class FairCandySwap_888 {


    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        HashSet<Integer> set = new HashSet<>();
        int aliceCount = 0;
        for (int i = 0; i < aliceSizes.length; i++) {
            aliceCount += aliceSizes[i];
        }

        int bobCount = 0;
        for (int i = 0; i < bobSizes.length; i++) {
            bobCount += bobSizes[i];
            set.add(bobSizes[i]);
        }
        int diff  = (aliceCount - bobCount)/2;

        for (int i = 0; i < aliceSizes.length; i++) {
            int tmp = aliceSizes[i] -diff;
            if(set.contains(tmp)){
                return new int[]{aliceSizes[i],tmp};
            }
        }
        return new int[0];



    }
}
