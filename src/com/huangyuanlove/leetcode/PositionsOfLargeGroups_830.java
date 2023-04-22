package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

import java.util.ArrayList;
import java.util.List;

public class PositionsOfLargeGroups_830 {
    public static void main(String[] args) {
//        List<List<Integer>> result =   largeGroupPositions("aaa");
        List<List<Integer>> result =   largeGroupPositions("abcdddeeeeaabbbcd");
        for (int i = 0; i < result.size(); i++) {
            ArrayListHelper.printList(result.get(i));
        }
    }

    public static List<List<Integer>> largeGroupPositions(String s) {

        ArrayList<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        int currentCount = 1;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)){
                currentCount++;
            }else{
                if(currentCount>=3){
                    current.add(i-currentCount+1);
                    current.add(i);
                    result.add(current);

                }
                currentCount = 1;
                current = new ArrayList<>();
            }
        }
        if(currentCount>=3){
            current.add(s.length()-currentCount);
            current.add(s.length()-1);
            result.add(current);
        }
        return result;

    }
}
