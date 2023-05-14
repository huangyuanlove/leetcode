package com.huangyuanlove.leetcode.contest;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

public class MaximumNumberOfMovesInAGrid_6433 {


    public static void main(String[] args) {
        int testCase[][] = new int[][]{
                {187, 167, 209, 251, 152, 236, 263, 128, 135},
                {267, 249, 251, 285, 73, 204, 70, 207, 74},
                {189, 159, 235, 66, 84, 89, 153, 111, 189},
                {120, 81, 210, 7, 2, 231, 92, 128, 218},
                {193, 131, 244, 293, 284, 175, 226, 205, 245}
        };


//         int testCase [][] =new int[][]{
//                 {1000000,92910,1021,1022,1023,1024,1025,1026,1027,1028,1029,1030,1031,1032,1033,1034,1035,1036,1037,1038,1039,1040,1041,1042,1043,1044,1045,1046,1047,1048,1049,1050,1051,1052,1053,1054,1055,1056,1057,1058,1059,1060,1061,1062,1063,1064,1065,1066,1067,1068},
//                 {1069,1070,1071,1072,1073,1074,1075,1076,1077,1078,1079,1080,1081,1082,1083,1084,1085,1086,1087,1088,1089,1090,1091,1092,1093,1094,1095,1096,1097,1098,1099,1100,1101,1102,1103,1104,1105,1106,1107,1108,1109,1110,1111,1112,1113,1114,1115,1116,1117,1118}
//
//         };

//         int testCase[][] = new int[][]{
//                 {2,4,3,5},{5,4,9,3}, {3,4,2,11},{10,9,13,15}
//         };

        System.out.println(new MaximumNumberOfMovesInAGrid_6433().maxMoves(testCase));
        for (int i = 0; i < testCase.length; i++) {
            ArrayListHelper.printList(testCase[i]);
            System.out.println();
        }
    }

    public int maxMoves(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            int currentResult = 0;
            if (i == 0) {
                if (grid[0][0] >= grid[0][1] && grid[0][0] >= grid[1][1]) {
                    currentResult = 0;
                } else {
                    currentResult = visit(grid, 0, 0);
                }

            } else {
                if (i + 1 == grid.length) {
                    if (grid[i][0] >= grid[i][1] && grid[i][0] >= grid[i - 1][1]) {
                        currentResult = 0;
                    } else {
                        currentResult = visit(grid, i, 0);
                    }
                } else {
                    if (grid[i][0] >= grid[i][1] && grid[i][0] >= grid[i - 1][1] && grid[i][0] >= grid[i + 1][1]) {
                        currentResult = 0;
                    } else {
                        currentResult = visit(grid, i, 0);
                    }
                }


            }
            System.out.println(currentResult);
            max = Math.max(currentResult, max);
        }
        System.out.println("----");
        return max;
    }

    public int visit(int[][] grid, int row, int col) {
        //截止条件
        if (col + 1 == grid[row].length) {
            return 0;
        }


        int right = 0;
        //向右
        if (grid[row][col] < grid[row][col + 1]) {
            right = visit(grid, row, col + 1);
        }
        //右上
        int bottom = 0;
        if (row - 1 > 0) {
            if (grid[row][col] < grid[row - 1][col + 1]) {
                bottom = visit(grid, row - 1, col + 1);
            }
        }
        //右下

        int rightAndBottom = 0;
        if (row + 1 < grid.length)
            if (grid[row][col] < grid[row + 1][col + 1]) {
                rightAndBottom = visit(grid, row + 1, col + 1);
            }
        int result = Math.max(Math.max(right, bottom), rightAndBottom);

        return result + 1;

    }
}
