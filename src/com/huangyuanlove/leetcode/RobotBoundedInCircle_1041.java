package com.huangyuanlove.leetcode;

public class RobotBoundedInCircle_1041 {
    public static void main(String[] args) {
        System.out.println(isRobotBounded("GLGLGGLGL"));
    }

    public static boolean isRobotBounded(String instructions) {
        int x = 0;
        int y = 0;
        int d = 0;//朝向；0 上  1 左 2下 3右


        for (int i = 0; i < instructions.length(); i++) {
            if (instructions.charAt(i) == 'L') {
                if (d == 3) {
                    d = 0;
                } else {
                    d += 1;
                }

            } else if (instructions.charAt(i) == 'R') {

                if (d == 0) {
                    d = 3;
                } else {
                    d -= 1;
                }
            } else {
                if (d == 0) {
                    y++;
                } else if (d == 1) {
                    x--;
                } else if (d == 2) {
                    y--;
                } else {
                    x++;
                }
            }
        }

        if(d == 0){
            return x == 0 && y == 0;
        }
        return false;

    }
}
