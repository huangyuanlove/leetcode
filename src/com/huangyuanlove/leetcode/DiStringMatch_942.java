package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

public class DiStringMatch_942 {
    public static void main(String[] args) {
int []result = new DiStringMatch_942().diStringMatch("IDID");
        ArrayListHelper.printList(result);
    }

    public int[] diStringMatch(String s) {
        char []chars = s.toCharArray();
        int min = 0;
        int max = chars.length;
        int[] result = new int[max+1];
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] =='D'){
                result[i] = max;
                max --;
            }else{
                result[i] = min;
                min++;
            }
        }
        result[chars.length] = min;
        return result;

    }
}
