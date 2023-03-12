package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ListNode;
import com.huangyuanlove.leetcode.helper.ListNodeHelper;

import java.util.HashSet;

public class IntersectionOfTwoLinkedLists_160 {
    public static void main(String[] args) {
        ListNode a = ListNodeHelper.createLIstByNumber(new int[]{4,1,8,4,5});
        ListNode b = ListNodeHelper.createLIstByNumber(new int[]{5,6,1,8,4,5});
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode result = null;
        HashSet<ListNode> set = new HashSet<>();
        while (headA!=null){
            set.add(headA);
            headA = headA.next;
        }
        while (headB!=null){
            if(set.add(headB)){
                headB = headB.next;
            }else{
                result = headB;
                break;
            }
        }

        return result;

    }
}
