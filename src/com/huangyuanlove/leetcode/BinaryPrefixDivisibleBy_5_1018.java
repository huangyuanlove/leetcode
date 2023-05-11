package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisibleBy_5_1018 {
    public static void main(String[] args) {
        List<Boolean> result = new BinaryPrefixDivisibleBy_5_1018().prefixesDivBy5(new int[]{1,0,1,1,1,1,0,0,0,0,1,0,0,0,0,0,1,0,0,1,1,1,1,1,0,0,0,0,1,1,1,0,0,0,0,0,1,0,0,0,1,0,0,1,1,1,1,1,1,0,1,1,0,1,0,0,0,0,0,0,1,0,1,1,1,0,0,1,0});
        ArrayListHelper.printList(result);
        System.out.println();
        String reusultStr = "false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,false,false,true,true,true,true,false";
        reusultStr = reusultStr.replace(","," | ");
        System.out.println(reusultStr);

    }

    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList<Boolean> result = new ArrayList<>(nums.length);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum << 2;
            sum += nums[i];
            System.out.println(sum);
            if (sum % 5 == 0) {
                result.add(true);
            } else {
                result.add(false);
            }
            sum %=10;

        }
        return result;


    }
}
