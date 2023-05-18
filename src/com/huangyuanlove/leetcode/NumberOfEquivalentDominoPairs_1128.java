package com.huangyuanlove.leetcode;

public class NumberOfEquivalentDominoPairs_1128 {
    public static void main(String[] args) {

    }
    public int numEquivDominoPairs(int[][] dominoes) {
        int num[] = new int[100];
        int result = 0;
        for (int i = 0; i < dominoes.length; i++) {
            int nums = dominoes[i][0] > dominoes[i][1] ? dominoes[i][0] * 10 + dominoes[i][1] : dominoes[i][1] * 10 + dominoes[i][0];
            result += num[nums];
            num[nums]++;


        }
        return result;
    }
}
