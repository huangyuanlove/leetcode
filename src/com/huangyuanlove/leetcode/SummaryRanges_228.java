package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges_228 {
    public static void main(String[] args) {
        ArrayListHelper.printList( summaryRanges(new int[]{0,2,3,4,6,8,9}));
    }

    public static List<String> summaryRanges(int[] nums) {
        ArrayList<String> result = new ArrayList<>();
        if(nums.length == 0){
            
        }else if(nums.length == 1){
            result.add(nums[0]+"");
        }else{
            StringBuffer sb = new StringBuffer();
            int lastIndex = 0;
            for (int i = 0; i < nums.length; i++) {
                if(sb.length() ==0){
                    sb.append(nums[i]);
                    lastIndex = i;
                }else{
                    if(nums[i] - nums[i-1] ==1){
                        continue;
                    }else{
                        if(i - lastIndex == 1){
                            result.add(sb.toString());
                            sb.delete(0,sb.length());
                            sb.append(nums[i]);
                        }else{
                            sb.append("->").append(nums[i-1]);
                            result.add(sb.toString());
                            sb.delete(0,sb.length());
                            sb.append(nums[i]);
                            lastIndex = i;
                        }

                    }

                }
            }
            if(sb.length()!=0){
                result.add(sb.toString());
            }
        }
        return result;
    }
}
