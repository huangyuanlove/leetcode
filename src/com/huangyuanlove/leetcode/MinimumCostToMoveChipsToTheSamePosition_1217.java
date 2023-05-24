package com.huangyuanlove.leetcode;

public class MinimumCostToMoveChipsToTheSamePosition_1217 {

    public int minCostToMoveChips(int[] position) {
        int old = 0;
        int event = 0;
        for (int n : position) {
            if ((n & 1) == 0) {
                old ++;
            }else{
                event ++;
            }
        }
        return Math.min(old,event);

    }
}
