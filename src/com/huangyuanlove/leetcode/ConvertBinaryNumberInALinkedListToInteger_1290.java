package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ListNode;

public class ConvertBinaryNumberInALinkedListToInteger_1290 {
    public static void main(String[] args) {

    }

    public int getDecimalValue(ListNode head) {
        if(head == null){
            return 0;
        }
        int result =0;
        while (head !=null){
            result = (result<<1 )+ head.val;
            head = head.next;
        }
        return result;

    }
}
