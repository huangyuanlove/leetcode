package com.huangyuanlove.leetcode;

public class CheckIfAll1sAreAtLeastLengthKPlacesAway_1437 {
    public static void main(String[] args) {
        int[] testCase = new int[]{1,0,0,1,0,1};
        System.out.println(kLengthApart(testCase,2));
    }
    public static boolean kLengthApart(int[] nums, int k) {
        int count = -1;
        for (int n : nums) {
            if(n == 1){
                if(count == -1){
                    count = 0;
                }else{
                    if(count < k){
                        return false;
                    }else{
                        count = 0;
                    }
                }


            }else{
                if(count!=-1){
                    count ++;
                }
            }
        }

        return true;
    }
}
