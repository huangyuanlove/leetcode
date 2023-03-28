package com.huangyuanlove.leetcode;

public class IslandPerimeter_463 {
    public static void main(String[] args) {
//    int result =    islandPerimeter(new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}});
    int result =    islandPerimeter(new int[][]{{1,0}});
        System.out.println(result);
        System.out.println(Math.pow(-2,31) * 1L);
    }

    public static int islandPerimeter(int[][] grid) {
        int result = 0;
        int row= grid.length;
        int colum = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {

                int current = grid[i][j];
                if(current == 1){
                    //左侧没有
                    if(i -1 <0 || grid[i-1][j] ==0){
                        result ++;
                    }
                    //右方没有
                    if(i +1 >= row || grid[i+1][j] ==0){
                        result ++;
                    }
                    //上方没有
                    if(j-1 <0 || grid[i][j-1] ==0){
                        result++;
                    }
                    //下方没有
                    if(j+1 >= colum || grid[i][j+1] ==0){
                        result++;
                    }
                }
            }

        }
        return result;
    }
}
