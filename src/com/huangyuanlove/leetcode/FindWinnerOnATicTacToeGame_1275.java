package com.huangyuanlove.leetcode;

public class FindWinnerOnATicTacToeGame_1275 {

    public static void main(String[] args) {

        int[][] testCase = new int[][]{ {0,0},{1,1},{0,1},{0,2},{1,0},{2,0} };
        System.out.println(tictactoe(testCase));
    }

    public static String tictactoe(int[][] moves) {
        int chessboard[] = new int [9];
        for (int i = 0; i < moves.length; i++) {
            int [] current = moves[i];
            int value = 1;
            if( (i&1) == 0){
                value = 2;
            }else{
               value =1;
            }
            chessboard[ current[0]*3 + current[1] ] = value;
        }
        if(chessboard[0]!=0&&  chessboard[0]==chessboard[1] && chessboard[1] ==chessboard[2] ){
            if(chessboard[0] == 1){
                return "B";
            }else{
                return "A";
            }

        }else if(chessboard[3]!=0&& chessboard[3]==chessboard[4] && chessboard[4] ==chessboard[5]){
            if(chessboard[3] == 1){
                return "B";
            }else{
                return "A";
            }
        }else if(chessboard[6]!=0&& chessboard[6]==chessboard[7] && chessboard[7] ==chessboard[8]){
            if(chessboard[6] == 1){
                return "B";
            }else{
                return "A";
            }
        }else if(chessboard[0]!=0&& chessboard[0]==chessboard[3] && chessboard[3] ==chessboard[6]){
            if(chessboard[0] == 1){
                return "B";
            }else{
                return "A";
            }
        }else if(chessboard[1]!=0&& chessboard[1]==chessboard[4] && chessboard[4] ==chessboard[7]){
            if(chessboard[1] == 1){
                return "B";
            }else{
                return "A";
            }
        }else if(chessboard[2]!=0&& chessboard[2]==chessboard[5] && chessboard[5] ==chessboard[8]){
            if(chessboard[2] == 1){
                return "B";
            }else{
                return "A";
            }
        }else if(chessboard[0]!=0&& chessboard[0]==chessboard[4] && chessboard[4] ==chessboard[8]){
            if(chessboard[0] == 1){
                return "B";
            }else{
                return "A";
            }
        }else if(chessboard[2]!=0&& chessboard[2]==chessboard[4] && chessboard[4] ==chessboard[6]){
            if(chessboard[2] == 1){
                return "B";
            }else{
                return "A";
            }
        }else{
            if(moves.length == 9){
                return "Draw";
            }else{
                return "Pending";
            }
        }


    }
}
