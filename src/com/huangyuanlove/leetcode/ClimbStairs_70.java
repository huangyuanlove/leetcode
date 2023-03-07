package com.huangyuanlove.leetcode;

public class ClimbStairs_70 {
    public static void main(String[] args) {
        for (int i = 1; i < 45; i++) {
            int result1 = climbStairs(i);
            int result2 = climbStairs1(i);
            System.out.println(result1 +"\t" +result2 +( (result1 == result2)?"正确":"错误" ) );
        }
    }

    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int result = 3;
        int pre = 2;
        int tmp = 0;
        for (int i = 4; i <= n; i++) {
            tmp = result;
           
            result += pre;
            pre = tmp;
        }
        return result;

    }

    public static int climbStairs1(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

}
