package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

public class MoveZeroes_283 {
    public static void main(String[] args) {
        moveZeroes(new int[]{1});
    }

    public static void moveZeroes(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] ==0){
                count ++;
            }else{
                if(count >0){
                    nums[i-count] = nums[i];
                    nums[i] = 0;
                }

            }
        }

        ArrayListHelper.printList(nums);

    }

}
