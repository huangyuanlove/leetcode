package com.huangyuanlove.leetcode;

import java.util.Arrays;

public class AssignCookies_455 {
    public static void main(String[] args) {

    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gIndex= 0;
        int sIndex = 0;
        int count = 0;
        while (gIndex < g.length && sIndex<s.length){
            if(g[gIndex] <= s[sIndex]){
                gIndex ++;
                count ++;
            }
            sIndex ++;

        }
        return count;

    }
}
