package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

public class SortArrayByParity_ii_922 {
    public static void main(String[] args) {
        int []nums =new int[]{4,2,5,7};
      int result[] =  new SortArrayByParity_ii_922().sortArrayByParityII(nums);
        ArrayListHelper.printList(result);

    }

    public int[] sortArrayByParityII(int[] nums) {
        int odd = 1;
        int even = 0;
        while (odd < nums.length  && even < nums.length){
            if( (nums[odd]&1)==1  && (nums[even]&1)==0 ){
                odd +=2;
                even+=2;
            }else if((nums[odd]&1)==0  && (nums[even]&1)==0 ){
                even+=2;
            }else if((nums[odd]&1)==1  && (nums[even]&1)==1 ){
                odd +=2;
            }else{
                int tmp = nums[odd];
                nums[odd] = nums[even];
                nums[even] = tmp;
            }


        }
        return nums;


    }
}
