package com.huangyuanlove.leetcode;

public class ProjectionAreaOf3DShapes_883 {
    public static void main(String[] args) {
        System.out.println(projectionArea( new int[][]{{1,2},{3,4}}));
    }
    public static int projectionArea(int[][] grid) {
        int top = 0;
        int left = 0;
        int front = 0;
        for (int i = 0; i < grid.length; i++) {
            int max = 0;
            for (int j = 0; j < grid[i].length; j++) {
                max = Math.max(max,grid[i][j]);
                if(grid[i][j]!=0){
                    top ++;
                }
            }
            left += max;
        }

        for (int i = 0; i < grid[0].length; i++) {
            int max = 0;
            for (int j = 0; j < grid.length; j++) {
                max = Math.max(max,grid[j][i]);
            }
            front += max;
        }
        return top + left + front;


    }
}
