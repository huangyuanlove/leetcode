package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges_228 {
    public static void main(String[] args) {
        ArrayListHelper.printList( summaryRanges(new int[]{0,2,3,4,6,8,9}));
        ArrayListHelper.printList( summaryRanges(new int[]{0,1,2,4,5,7}));
    }

    public static List<String> summaryRanges(int[] nums) {
        ArrayList<String> result = new ArrayList<>();
        if(nums.length == 0){
            
        }else if(nums.length == 1){
            result.add(nums[0]+"");
        }else{
            int sbIndex = 0;

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < nums.length; i++) {
                if(sb.length() == 0){
                    sb.append(nums[i]);
                    sbIndex = i;
                }else{
                    //里面有值，下面两种情况：
                    // continue
                    // 拼接 -> nums[i];
                    // 追加结果 清空 设置当前值
                    //什么情况continue？ nums[i] - nums[i-1] == 1
                    if(nums[i] - nums[i-1] == 1){

                    }else{
                        if(i - sbIndex>1){
                            sb.append("->").append(nums[i-1]);
                        }
                        result.add(sb.toString());
                        sb.delete(0,sb.length());
                        sb.append(nums[i]);
                        sbIndex = i;
                    }
                }
            }

            if(sbIndex != nums.length-1){
                sb.append("->").append(nums[nums.length-1]);
            }

            if(sb.length() > 0){
                result.add(sb.toString());
            }
        }
        return result;
    }
}
