package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix_54 {
    public static void main(String[] args) {
//        int[][] testCase = new int[][]{
//                {1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12},
//                {13,14,15,16},
//
//
//        };
        int[][] testCase = new int[][]{
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };


        List<Integer> result = spiralOrder(testCase);
        ArrayListHelper.printList(result);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        //右 matrix[i].lenght -1;
        //下 j++
        //左  i--
        //上 j--

        int row = matrix.length;
        int colum = matrix[0].length;
        //计算循环几次
        int tmp = Math.min(row,colum);
        int pool = (tmp +1)/2;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < pool; i++) {
            //每次循环应该走的步数
            int rowStep = colum- i*2 -1;
            //
            int columStep = row - i*2 -1;
            //先向右
            for (int j = 0; j < rowStep ; j++) {
                //固定行,列增加
                result.add(matrix[i][j+i]);
            }
            //向下
            for (int j = 0; j < columStep; j++) {
                //固定列，行增加
                result.add(matrix[j+i][colum-i-1]);
            }
            //向左
            for (int j = 0; j < rowStep; j++) {
                //固定行不动，列减小
                result.add(matrix[row-i-1][ colum-i-j-1 ]  );
            }
            //向上
            for (int j = 0; j < columStep; j++) {
                //固定列不动，行减小
                result.add(matrix[row-i-j-1] [i] );
            }
        }
        return result;


        


    }

}
