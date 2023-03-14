package com.huangyuanlove.leetcode;

public class MajorityElement_169 {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2,2,3}));
    }
    public static int majorityElement(int[] nums) {
        if(nums.length == 1){
             return nums[0];
        }

        int count = 0;
        int result = 0;
        for (int num : nums) {
            if(count == 0){
                count  = 1;
                result = num;
            }else if(count >0){
                if(result == num){
                    count ++;
                }else{
                    count --;
                }
            }

        }
        return result;

    }
}
