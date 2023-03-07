package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ListNode;
import com.huangyuanlove.leetcode.helper.ListNodeHelper;

public class DeleteDuplicates_83 {


    public static void main(String[] args) {
        ListNode listNode = ListNodeHelper.createDuplicatesList();
        ListNodeHelper.printListNode(listNode);
        ListNode result = deleteDuplicates(listNode);
        ListNodeHelper.printListNode(result);


    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode current = head;
        ListNode next = head.next;
        while (next!=null){
            if(current.val != next.val){
                current.next = next;
                current = next;
                next = next.next;
            }else{
                next = next.next;
                if(next == null){
                    current.next = null;
                }
            }
        }
        return head;


    }
}
