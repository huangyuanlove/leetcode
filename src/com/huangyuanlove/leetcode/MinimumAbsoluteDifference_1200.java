package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDifference_1200 {
    public static void main(String[] args) {
        ArrayListHelper.printList(minimumAbsDifference(new int[]{4,2,1,3}));
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        //找最小绝对差
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            minDiff = Math.min(minDiff,arr[i+1]-arr[i]);
        }

        //找元素对
        int min = 0;
        int max =1;
        while (max <arr.length){
            int diff = arr[max] - arr[min];

            if(diff == minDiff){
                ArrayList<Integer> tmp = new ArrayList<>();
                tmp.add(arr[min]);
                tmp.add(arr[max]);
                result.add(tmp);
                min ++;
                max ++;
            }else if(diff < minDiff){
                max++;
            }else{
                min++;
            }
        }
        return result;
        
    }
    
}
