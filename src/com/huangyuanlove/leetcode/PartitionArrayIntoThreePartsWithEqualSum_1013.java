package com.huangyuanlove.leetcode;

public class PartitionArrayIntoThreePartsWithEqualSum_1013 {
    public static void main(String[] args) {
      boolean result =  new PartitionArrayIntoThreePartsWithEqualSum_1013().canThreePartsEqualSum(new int[]{0,2,1,-6,6,-7,9,1,2,0,1});
        System.out.println(result);
    }

    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int n :
                arr) {
            sum += n;
        }
        if (sum % 3 != 0) {
            return false;
        }
        int average = sum / 3;
        sum = 0;
        int count = 0;
        for (int n : arr) {
            sum += n;
            if(sum == average){
                sum =0;
                count ++;
            }
        }
        return count == 3;
    }
}
