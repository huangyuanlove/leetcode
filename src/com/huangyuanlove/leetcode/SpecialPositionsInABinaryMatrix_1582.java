package com.huangyuanlove.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SpecialPositionsInABinaryMatrix_1582 {
    public static void main(String[] args) {
//        [[1,0,0],[0,0,1],[1,0,0]]
//[[1,0,0],[0,1,0],[0,0,1]]
//[[0,0,0,1],[1,0,0,0],[0,1,1,0],[0,0,0,0]]
//[[0,0,0,0,0],[1,0,0,0,0],[0,1,0,0,0],[0,0,1,0,0],[0,0,0,1,1]]
//        int testCase[][] = new int[][]{{1,0,0},{0,0,1},{1,0,0}};
        int testCase[][] = new int[][]{
                {0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 1},
                {0, 0, 0, 0, 1, 0, 0, 0},
                {1, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 0}};
        System.out.println(numSpecial(testCase));
    }

    public static int numSpecial(int[][] mat) {
        //记录哪一行的哪个位置是1，并且整行只有一一个1
        int[] recorder = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            int index = -1;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    if (index == -1) {
                        index = j;
                    } else {
                        index = -2;
                    }
                }
            }

            recorder[i] = index;

        }
        int count = 0;
        for(int num : recorder ){
            if(num >=0){
                //这一列是否为1
                int sum = 0;
                for (int i = 0; i < mat.length; i++) {
                    sum += mat[i][num];
                }
                if(sum == 1){
                    count ++;
                }
            }
        }
        return count;

    }


}
