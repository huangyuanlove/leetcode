package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

public class ReshapeTheMatrix_556 {
    public static void main(String[] args) {
        int [][] mat = new int[][]{{1,2,3},{4,5,6}};
        for (int i = 0; i < mat.length; i++) {
            ArrayListHelper.printList(mat[i]);
        }
        System.out.println("------------");
        int [][]result = matrixReshape(mat,3,2);
        for (int i = 0; i < result.length; i++) {
            ArrayListHelper.printList(result[i]);
        }
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int maxR = mat.length;
        int maxC = mat[0].length;
        if(maxC * maxR != r*c){
            return mat;
        }

        int [][] result = new int[r][c];
        for (int i = 0; i < maxC * maxR; i++) {
            result[i/c][i%c] =mat[i / maxC][i % maxC];
        }
        return  result;


    }
}
