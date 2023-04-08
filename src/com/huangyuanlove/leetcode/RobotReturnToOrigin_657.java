package com.huangyuanlove.leetcode;

public class RobotReturnToOrigin_657 {

    public static void main(String[] args) {

    }

    public static boolean judgeCircle(String moves) {
        int countR = 0;
        int countU = 0;
        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            if(c == 'U'){
                countU ++;
            }else if(c =='D'){
                countU --;
            } else if (c == 'R') {
                countR ++;

            }else {
                countR--;
            }

        }

        return countR + countU ==0;
    }
}
