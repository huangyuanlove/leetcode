package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

public class FindNUniqueIntegersSumUpToZero_1304 {
    public static void main(String[] args) {
        ArrayListHelper.printList(sumZero(5));
        ArrayListHelper.printList(sumZero(6));
    }

    public static int[] sumZero(int n) {
        int[] result = new int[n];
        int tag = n /2;
        int start = 0;
        int end = n-1;
        while (start < end){

            result[start] = -tag;
            result[end] = tag;
            start ++;
            end --;
            tag --;

        }
        return  result;

    }
}
