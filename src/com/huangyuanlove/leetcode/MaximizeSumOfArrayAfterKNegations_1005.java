package com.huangyuanlove.leetcode;

import java.util.Arrays;

public class MaximizeSumOfArrayAfterKNegations_1005 {
    public static void main(String[] args) {

        System.out.println(new MaximizeSumOfArrayAfterKNegations_1005().largestSumAfterKNegations(new int[]{8, -7, -3, -9, 1, 9, -6, -9, 3}, 8));
    }

    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;

        if (nums[0] >= 0) {
            for (int n : nums) {
                sum += n;
            }
            if (k % 2 == 0) {
                return sum;
            } else {
                return sum - nums[0] * 2;
            }
        } else {
            for (int n : nums) {
                sum += n;
            }
            int negativeCount = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < 0) {
                    negativeCount++;
                } else {
                    break;
                }
            }

            if (k <= negativeCount) {
                //负数从最大的开始 全变成正数
                for (int i = 0; i < k; i++) {
                    sum += nums[i] * -2;
                }
                return sum;

            } else {
                //k 大于负数个数，将负数全变为正数之后还有剩余
                for (int i = 0; i < negativeCount; i++) {
                    sum += nums[i] * -2;
                }



                if ((k - negativeCount) % 2 == 0 ) {
                    return sum;
                } else {
                    if(negativeCount == nums.length){
                        return sum + nums[negativeCount - 1] * 2;
                    }else{
                        int tmp = Math.min(Math.abs(nums[negativeCount - 1]), nums[negativeCount]);
                        return sum - Math.abs(tmp) * 2;
                    }


                }

            }


        }

    }
}
