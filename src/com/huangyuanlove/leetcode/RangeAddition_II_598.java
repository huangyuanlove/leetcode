package com.huangyuanlove.leetcode;

public class RangeAddition_II_598 {
    public static void main(String[] args) {

    }
    public static int maxCount(int m, int n, int[][] ops) {
        if(ops.length ==0){
            return m *n;
        }
        int minC = m;
        int minR = n;
        for (int i = 0; i < ops.length; i++) {
            minR = Math.min(ops[i][0],minR);
            minC = Math.min(ops[i][1],minC);
        }
        return minC * minR;

    }
}
