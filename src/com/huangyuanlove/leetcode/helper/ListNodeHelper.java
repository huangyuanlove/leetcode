package com.huangyuanlove.leetcode.helper;

public class ListNodeHelper {
    public static ListNode createDuplicatesList(){
        ListNode listNode = new ListNode(1);

        ListNode listNode2 = new ListNode(2);
        listNode.next = listNode2;

        ListNode listNode3 = new ListNode(3);
        listNode2.next = listNode3;

        ListNode listNode4 = new ListNode(3);
        listNode3.next = listNode4;

        ListNode listNode5 = new ListNode(4);
        listNode4.next = listNode5;
        return  listNode;

    }
    public static void printListNode(ListNode listNode){
       while (listNode != null){
           System.out.print(listNode.val +" -> ");
           listNode = listNode.next;
       }
        System.out.println();
    }
}
