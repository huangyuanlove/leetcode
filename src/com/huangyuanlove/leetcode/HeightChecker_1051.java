package com.huangyuanlove.leetcode;

import java.util.Arrays;

public class HeightChecker_1051 {
    public static void main(String[] args) {
        System.out.println(new HeightChecker_1051().heightChecker(new int[]{1,1,4,2,1,3}));
    }

    public int heightChecker(int[] heights) {
      int news[]=  Arrays.copyOf(heights,heights.length);
      Arrays.sort(heights);
      int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if(heights[i] != news[i]){
                count ++;
            }
        }
        return count;

    }
}
