package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

public class TransposeMatrix_867 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8}};
        for (int i = 0; i < matrix.length; i++) {
            ArrayListHelper.printList(matrix[i]);
        }
        int [][] result = transpose(matrix);
        for (int i = 0; i < result.length; i++) {
            ArrayListHelper.printList(result[i]);
        }
    }

    public static int[][] transpose(int[][] matrix) {
        if(matrix.length ==0){
            return matrix;
        }
        int row = matrix.length; //行 2
        int colum = matrix[0].length;//列 4

        int[][]result = new int[colum][row];


        int sum = row * colum;
        for (int i = 0; i < sum; i++) {
            int currentRow =  i/colum;
            int currentColum = i - currentRow * colum;
            result[currentColum][currentRow]   =   matrix[currentRow][currentColum];
        }
        
        return result;
        

    }
}
