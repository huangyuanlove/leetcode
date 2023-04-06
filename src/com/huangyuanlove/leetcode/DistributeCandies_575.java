package com.huangyuanlove.leetcode;

import java.util.HashSet;

public class DistributeCandies_575 {
    public static void main(String[] args) {

    }

    public static int distributeCandies(int[] candyType) {
        int result = candyType.length /2;
        HashSet<Integer> set = new HashSet<>();
        for (int j : candyType) {
            set.add(j);
            if(set.size() >= result){
                return  result;
            }
        }
        return set.size();

    }
}
