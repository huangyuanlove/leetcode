package com.huangyuanlove.leetcode;

public class LargestNumberAtLeastTwiceOfOthers_747 {
    public static void main(String[] args) {

    }
    public int dominantIndex(int[] nums) {
        //记录一个最大的，记录一个最小的；
        if(nums.length ==1){
            return nums[0];
        }
        int max = -1;
        int maxIndex = -1;

        int sMax = -1;
        int sMaxIndex =-1;

        if(nums[0]> nums[1]){
            max = nums[0];
            maxIndex = 0;

            sMaxIndex = 1;
            sMax = nums[1];
        }else{
            max = nums[1];
            maxIndex = 1;

            sMaxIndex = 0;
            sMax = nums[0];
        }
        for (int i = 2; i <nums.length ; i++) {
            if(sMax > nums[i]){
                //比小的还要小，不关注
            }else{
                //比小的大，继续
                if(max < nums[i]){
                    //比大的还大
                    sMax = max;
                    sMaxIndex = maxIndex;

                    maxIndex = i;
                    max = nums[i];
                }else{
                    //比大的小
                    sMaxIndex = i;
                    sMax = nums[i];
                }
            }


        }



        if(max >= 2* sMax){
            return maxIndex;
        }
        return -1;

    }
}
