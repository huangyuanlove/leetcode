package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

public class MissingNumber_268 {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{1, 2}));
    }

    public static int missingNumber(int[] nums) {
        boolean hasMax = false;
        int lose = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums.length) {
                hasMax = true;
                nums[i] = -1;
                lose = i;
            } else {
                while (nums[i] != i) {
                    if (nums[i] == nums.length) {
                        hasMax = true;
                        nums[i] = -1;
                        lose = i;
                    } else {
                        if (nums[i] == -1) {
                            lose = i;
                            break;
                        }
                        int tmp = nums[i];
                        nums[i] = nums[nums[i]];
                        nums[tmp] = tmp;

                    }
                }
            }

            ArrayListHelper.printList(nums);
        }
        if (!hasMax) {
            return nums.length;
        } else {
            return lose;
        }

    }
}
