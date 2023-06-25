package com.huangyuanlove.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_54 {
    public static void main(String[] args) {
//        int[][]testCase = new int[][]{
//                {1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12},
//                {13,14,15,16}
//        };
//        int[][]testCase = new int[][]{
//                {1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12},
//        };
//        int[][]testCase = new int[][]{
//                {1,2,3},
//                {4,5,6},
//                {7,8,9},
//                {10,11,12}
//        };
//        int [][]testCase = new int[][]{{1},{2},{3}};
        int[][]testCase = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
//        int[][] testCase = new int[][]{
//                {2, 3, 4},
//                {5, 6, 7},
//                {8, 9, 10},
//                {11, 12, 13},
//                {14, 15, 16}
//        };
        spiralOrder(testCase);

    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        //行
        int row = matrix.length;
        //列
        int colum = matrix[0].length;

        //循环的次数
        int loopCount = (Math.min(row, colum) + 1) / 2;
        for (int i = 0; i < loopCount; i++) {

            //向右，当前行的所有值
            System.out.print("向右--> ");
            for (int j = i; j < colum-i; j++) {
                result.add(matrix[i][j]);
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
            if(result.size() == row*colum){
                break;
            }

            //向下, colum-i-1 列
            System.out.print("向下--> ");
            for (int j = i+1; j < row-i-1 ; j++) {
                result.add(matrix[j][colum-i-1]);
                System.out.print(matrix[j][colum-i-1] +" ");
            }
            System.out.println();
            if(result.size() == row*colum){
                break;
            }
            //向左
            System.out.print("向左--> ");
            for (int j = colum-i-1; j >=i ; j--) {
                result.add(matrix[row-i-1][j]);
                System.out.print(matrix[row-i-1][j] +" ");
            }
            System.out.println();
            if(result.size() == row*colum){
                break;
            }
            //向上,i 列;row - i -1 行
            System.out.print("向上--> ");
            for (int j = row-i-2; j >i  ; j--) {
                result.add(matrix[j][i]);
                System.out.print(matrix[j][i] +" ");
            }
            System.out.println();
            if(result.size() == row*colum){
                break;
            }


        }

        return result;
    }
}
