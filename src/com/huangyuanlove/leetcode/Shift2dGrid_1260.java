package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

import java.util.ArrayList;
import java.util.List;

public class Shift2dGrid_1260 {
    public static void main(String[] args) {
//        int testCase [][] = new int[][]
//                {{3,8,1,9},{19,7,2,5},{4,6,11,10},{12,0,21,13}};
        int testCase[][] = new int[][]
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9},{10,11,12}};
//        int testCase[][] = new int[][]
//                {{1, 2, 3,4}, { 5, 6,7,8},{9,10,11,12}};
//        int testCase[][] = new int[][]
//                {{1},{2},{3},{4},{7},{6},{5}};


        List<List<Integer>> result = shiftGrid(testCase, 1);
        for (int i = 0; i < result.size(); i++) {

            ArrayListHelper.printList(result.get(i));
        }
    }

    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        int r = grid.length;
        int c = grid[0].length;
        int count = r * c;
        k = k % (r * c);
        if (k != 0) {
            int[] arr = new int[count];
            //展开成一维
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    arr[j+i*c] = grid[i][j];
                }
            }
            ArrayListHelper.printList(arr);
            ArrayList<Integer> tmp = new ArrayList<>();
            //先放后k个
            for (int i = count -k; i < count; i++) {

                tmp.add(arr[i]);
                if(tmp.size() == c){
                    result.add(tmp);
                    tmp = new ArrayList<>();
                }
            }
            for (int i = 0; i < count-k; i++) {
                tmp.add(arr[i]);
                if(tmp.size() == c){
                    result.add(tmp);
                    tmp = new ArrayList<>();
                }
            }


        } else {
            //将grid转化为二维列表

            for (int i = 0; i < r; i++) {
                ArrayList<Integer> tmp = new ArrayList<>();
                for (int j = 0; j < c; j++) {
                    tmp.add(grid[i][j]);
                }
                result.add(tmp);
            }

        }

        return result;

    }
}
