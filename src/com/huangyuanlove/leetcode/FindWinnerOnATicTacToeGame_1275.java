package com.huangyuanlove.leetcode;

public class FindWinnerOnATicTacToeGame_1275 {
    public static void main(String[] args) {

    }

    public String tictactoe(int[][] moves) {

        int [][] result = new int[3][3];
        for (int i = 0; i < moves.length; i++) {
            if( (i&2)==0 ){
                result[moves[i][0]][moves[i][1]] = 1;
            }else{
                result[moves[i][0]][moves[i][1]] = 2;
            }
        }


        //检查每一行
        boolean aWin = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(result[j][i] ==1 ){
                    continue;
                }else{
                    break;
                }

            }
        }



    }
    public static boolean isWin(int num){



    }


}
