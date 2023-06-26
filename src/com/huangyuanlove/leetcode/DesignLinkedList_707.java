package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ListNode;
import com.huangyuanlove.leetcode.helper.Node;

public class DesignLinkedList_707 {
    //todo 待完成


    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtIndex(0,10);
        myLinkedList.addAtIndex(0,20);
        myLinkedList.addAtIndex(1,30);
       int result =  myLinkedList.get(0);

    }




   static class MyLinkedList {

        ListNode virtualHead;
        int length = 0;
        public MyLinkedList() {
            virtualHead = new ListNode(-1);
        }

        public int get(int index) {
            ListNode head = virtualHead.next;
            if(index < 0){
                return -1;
            }
            if(head ==null){
                return -1;
            }
            if(index > length){
                return -1;
            }

            int count = 0;
            while (head!=null){
                if(count == index){
                    return head.val;
                }
                head = head.next;
                count ++;
            }
            return -1;


        }

        public void addAtHead(int val) {
            ListNode node = new ListNode(val);
            node.next = virtualHead.next;
            virtualHead.next = node;
            length ++;

        }

        public void addAtTail(int val) {

            ListNode head = virtualHead.next;
            if(head ==null){
                head = new ListNode(val);
                virtualHead.next = head;
            }else{
                while (head.next!=null){
                        head = head.next;
                }
                head.next = new ListNode(val);
            }
            length++;


        }

        public void addAtIndex(int index, int val) {
            if(index < 0){
                addAtHead(val);
            }else if(index == length){
                addAtTail(val);
            }else if(index > length){
                //ignore
            }else {
                int count = 0;
                ListNode head = virtualHead.next;
                while (count < index ){
                    head = head.next;
                    count ++;
                }

                ListNode tmp = new ListNode(val);
                tmp.next = head;
                virtualHead.next = tmp;
                length++;

            }
        }

        public void deleteAtIndex(int index) {
            if(length ==1){
                length --;
                virtualHead.next = null;
                return ;
            }
            if(index == 0){
                virtualHead.next = virtualHead.next.next;
                return ;
            }
            if(index>=0 && index < length){
                int count = 1;
                ListNode head = virtualHead.next;
                while (count < index){
                    head= head.next;
                    count ++;
                }
                head.next = head.next.next;
                length --;
            }
        }
    }
}
