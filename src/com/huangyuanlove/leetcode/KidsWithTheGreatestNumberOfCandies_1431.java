package com.huangyuanlove.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int n : candies) {
            max = Math.max(max,n);
        }
        for (int n:candies) {
            if(extraCandies + n >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;

    }
}
