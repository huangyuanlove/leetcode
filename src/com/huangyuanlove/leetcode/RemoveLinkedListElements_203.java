package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ListNode;
import com.huangyuanlove.leetcode.helper.ListNodeHelper;

public class RemoveLinkedListElements_203 {
    public static void main(String[] args) {
        ListNode node = ListNodeHelper.createLIstByNumber(new int[]{1,2});
       ListNode result = removeElements(node,2);
        ListNodeHelper.printListNode(result);

    }
    public static ListNode removeElements(ListNode head, int val) {
        ListNode result = null;
        ListNode tmp = null;
        while (head!=null){
            if(head.val!=val){
                if(tmp==null){
                    tmp = head;
                    result = tmp;
                    head = head.next;
                    tmp.next = null;
                }else{
                    tmp.next = head;
                    head = head.next;
                    tmp = tmp.next;
                    tmp.next = null;
                }

            }else{
                head = head.next;
            }

        }
        return result;

    }
}
