package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class TheKWeakestRowsInAMatrix_1331 {
    public static void main(String[] args) {


        int testCase[][] = new int[][]{
                {1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 0}
        };
        kWeakestRows(testCase,2);
    }

    public static int[] kWeakestRows(int[][] mat, int k) {

        Pair[]pars = new Pair[mat.length];
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    break;
                }
                count++;
            }
            Pair pair = new Pair();
            pair.num = i;
            pair.count = count;
            pars[i] = pair;
        }

        Arrays.sort(pars, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.count-o2.count;
            }
        });

        int result[] = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pars[i].num;
        }

        return result;
    }
   static class Pair {
       public int num;
        public int count;


   }

}
