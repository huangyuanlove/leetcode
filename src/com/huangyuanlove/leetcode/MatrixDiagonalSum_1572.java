package com.huangyuanlove.leetcode;

public class MatrixDiagonalSum_1572 {
    public static void main(String[] args) {

    }
    public int diagonalSum(int[][] mat) {
        int sum =0;
        for (int i = 0; i < mat.length; i++) {
//          0,0  0,mat[0].length-1 -0
//          1,1  1,mat[1].length-1 -1
//          mat.lenght-1,mat.lenght-1       mat.lenght-1,mat.lenght-1,
            sum +=mat[i][mat[i].length-1-i];
            if(i!= mat[i].length-1-i){
                sum +=mat[i][i];
            }


        }
        return sum;

    }
}
