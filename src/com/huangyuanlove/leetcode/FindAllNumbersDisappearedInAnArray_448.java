package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray_448 {
    public static void main(String[] args) {
        ArrayListHelper.printList(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }

    public static  List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {

                if(nums[nums[i]-1]>0){
                    nums[nums[i]-1] *=-1;
                }

            } else {
                if(nums[-nums[i] - 1]>0){
                    nums[-nums[i] - 1] *=-1;
                }

            }

        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >0){
            result.add(i+1);
            }
        }
        return  result;


    }
}
