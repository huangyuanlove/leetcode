package com.huangyuanlove.leetcode;

import java.util.Arrays;

public class LastStoneWeight_1046 {
    public static void main(String[] args) {
        System.out.println(new LastStoneWeight_1046().lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        int len = stones.length - 1;
        for (int i = len; i > 0; i--) {
            stones[len] = stones[len] - stones[len - 1];
            stones[len - 1] = 0;
            Arrays.sort(stones);
        }
        return stones[len];
    }

}
