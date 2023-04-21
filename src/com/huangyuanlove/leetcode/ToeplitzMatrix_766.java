package com.huangyuanlove.leetcode;

public class ToeplitzMatrix_766 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3,4},{5,1,2,3},{9,5,1,2}};
    }

    public static boolean isToeplitzMatrix(int[][] matrix) {

        if(matrix.length == 1){
            return true;
        }

        for (int i = 1; i < matrix.length ; i++) {
            for (int j = 1; j <matrix[i].length ; j++) {
                if(matrix[i][j] != matrix[i-1][j-1]){
                    return false;
                }
            }
        }
        
        
        return true;
        
    }
}
