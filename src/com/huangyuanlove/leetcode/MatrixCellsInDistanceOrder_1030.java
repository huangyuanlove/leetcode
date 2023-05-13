package com.huangyuanlove.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class MatrixCellsInDistanceOrder_1030 {
    public static void main(String[] args) {

    }

    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] res = new int[rows * cols][2];
        int index = 0;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                int[] xy = {i, j};
                res[index++] = xy;
            }
        Arrays.sort(res, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int dis1 = Math.abs(o1[0] - rCenter) + Math.abs(o1[1] - cCenter);
                int dis2 = Math.abs(o2[0] - rCenter) + Math.abs(o2[1] - cCenter);
                return dis1 - dis2;
            }
        });
        return res;
    }
}
