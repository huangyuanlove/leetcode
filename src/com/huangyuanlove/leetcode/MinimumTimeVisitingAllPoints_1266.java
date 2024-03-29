package com.huangyuanlove.leetcode;

public class MinimumTimeVisitingAllPoints_1266 {
    public static void main(String[] args) {
        int testCase[][] = new int[][]{{1,1},{3,4},{-1,0}};
        System.out.println(minTimeToVisitAllPoints(testCase));
    }

    public  static int minTimeToVisitAllPoints(int[][] points) {

        int result =0;
        for (int i = 1; i < points.length; i++) {

            result += Math.max(Math.abs(points[i][0] - points[i-1][0]), Math.abs(points[i][1] - points[i-1][1]) );

        }
        return result;

    }

}
