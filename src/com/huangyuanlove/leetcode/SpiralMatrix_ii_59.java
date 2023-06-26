package com.huangyuanlove.leetcode;

public class SpiralMatrix_ii_59 {
    public static void main(String[] args) {
        generateMatrix(1);
        System.out.println("===========");
       int result[][] = generateMatrix(3);
        System.out.println("===========");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static int[][] generateMatrix(int n) {
        int [][] result = new int[n][n];
        int loopCount = (n + 1) / 2;
        int current = 1;
        for (int i = 0; i < loopCount; i++) {

            //向右
            System.out.print("向右--> ");
            for (int j = i; j <n-i ; j++) {
                result[i][j] = current;
                System.out.print(current +" ");
                current ++;

            }
            System.out.println();
            if(current > n * n ){
                break;
            }
            //向下
            System.out.print("向下--> ");
            for (int j = i+1; j < n-i-1 ; j++) {
                result[j][n-i-1] = current;
                System.out.print(current +" ");
                current ++;

            }
            System.out.println();
            if(current > n * n ){
                break;
            }
            //向左
            System.out.print("向左--> ");
            for (int j = n-i-1; j >=i ; j--) {
                result[n-i-1][j] = current;
                System.out.print(current +" ");
                current ++;

            }
            //向上,i 列;row - i -1 行
            System.out.print("向上--> ");
            for (int j = n-i-2; j >i  ; j--) {
                result[j][i] = current;
                System.out.print(current +" ");
                current ++;

            }
            System.out.println();
            if(current > n * n ){
                break;
            }

        }

        return result;
    }
}
