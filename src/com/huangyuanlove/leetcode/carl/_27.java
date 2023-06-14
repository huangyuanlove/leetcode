package com.huangyuanlove.leetcode.carl;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

public class _27 {
    public static void main(String[] args) {

//        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2},2));
        System.out.println(removeElement(new int[]{1},1));
    }

    /**
     * 双指针
     */
    public static int removeElement(int[] nums, int val) {

        int start = 0;
        int end = nums.length-1;
        int count = 0;//记录val的个数

        while (start <= end){
            if(nums[start] == val){
                if(nums[end]!=val){
                    nums[start] = nums[end];

                }
                count ++;
                nums[end] = -1;
                end --;
            }else{
                start ++;
            }

            ArrayListHelper.printList(nums);
        }
//        for (int i = nums.length-1; i >=0 ; i--) {
//            if(nums[i] == -1){
//                count ++;
//            }
//        }
        return nums.length - count;
    }
}
