package com.huangyuanlove.leetcode;

import java.util.*;

public class LuckyNumbersInAMatrix_1380 {

    public List<Integer> luckyNumbers (int[][] matrix) {

        HashSet<Integer> minSet = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                min = Math.min(min,matrix[i][j]);
            }
            minSet.add(min);
        }

        for (int i = 0; i <  matrix[0].length; i++) {
            int max = 0;
            for (int j = 0; j < matrix.length; j++) {

                max =Math.max(max,matrix[j][i]);

            }
            if(!minSet.add(max)){
                ArrayList<Integer> r = new ArrayList<>();
                r.add(max);
                return r;
            }
        }
        return new ArrayList<>();

    }
}
