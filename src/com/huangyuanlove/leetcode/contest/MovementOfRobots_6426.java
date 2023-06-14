package com.huangyuanlove.leetcode.contest;

import java.util.Arrays;

public class MovementOfRobots_6426 {
    public static void main(String[] args) {
//        System.out.println(sumDistance(new int[]{-2,0,2},"RLL",3));
        System.out.println(sumDistance(new int[]{1,0},"RL",(int)Math.pow(10,9)));
        double result = Double.valueOf(Integer.MAX_VALUE )- Integer.MIN_VALUE;
        System.out.println(result);
    }

    public static int sumDistance(int[] nums, String s, int d) {
        int mode = (int) (Math.pow(10, 9) + 7);

        char[] chars = s.toCharArray();
        for (int i = 0; i < nums.length; i++) {
            if (chars[i] == 'L') {
                nums[i] = ((nums[i]%mode) - (d % mode)) %mode;
            } else {
                nums[i] = ((nums[i]%mode) + (d % mode))%mode;
            }
        }
        int result = 0;
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                result += (Math.abs(  nums[j] - nums[i]   ))%mode;
            }
        }
        return result;

    }
}
