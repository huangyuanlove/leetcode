package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RelativeRanks_506 {
    public static void main(String[] args) {
        String[]result = findRelativeRanks(new int[]{10,3,8,9,4});
        ArrayListHelper.printList(result);
    }
    public static String[] findRelativeRanks(int[] score) {
        HashMap<Integer,Integer> record = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            record.put(score[i],i);

        }
        Arrays.sort(score);

        String[] result = new String[score.length];
        for (int i = score.length-1; i >=0; i--) {
            int currentVal = score[i];
            if(i == score.length -1){
                result[record.get(currentVal)]="Gold Medal";
            }else if(i == score.length -2){
                result[record.get(currentVal)]="Silver Medal";
            } else if (i == score.length -3) {
                result[record.get(currentVal)]="Bronze Medal";

            }else{
                result[record.get(currentVal)]=String.valueOf(score.length-i);

            }

        }
        return  result;

    }
}
