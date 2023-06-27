package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ListNode;
import com.huangyuanlove.leetcode.helper.Node;

public class DesignLinkedList_707 {



    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtIndex(0, 10);
        myLinkedList.addAtIndex(0, 20);
        myLinkedList.addAtIndex(1, 30);
        int result = myLinkedList.get(0);

    }


    /**
     * MyLinkedList() 初始化 MyLinkedList 对象。
     * int get(int index) 获取链表中下标为 index 的节点的值。如果下标无效，则返回 -1 。
     * void addAtHead(int val) 将一个值为 val 的节点插入到链表中第一个元素之前。在插入完成后，新节点会成为链表的第一个节点。
     * void addAtTail(int val) 将一个值为 val 的节点追加到链表中作为链表的最后一个元素。
     * void addAtIndex(int index, int val) 将一个值为 val 的节点插入到链表中下标为 index 的节点之前。如果 index 等于链表的长度，那么该节点会被追加到链表的末尾。如果 index 比长度更大，该节点将 不会插入 到链表中。
     * void deleteAtIndex(int index) 如果下标有效，则删除链表中下标为 index 的节点。
     */

    static class MyLinkedList {

        ListNode virtualHead;
        int length = 0;

        public MyLinkedList() {
            virtualHead = new ListNode(-1);
        }

        public int get(int index) {
            ListNode head = virtualHead.next;
            if (index < 0) {
                return -1;
            }
            if (index >= length) {
                return -1;
            }
            if (head == null) {
                return -1;
            }

            int count = 0;
            while (head != null) {
                if (count == index) {
                    return head.val;
                }
                head = head.next;
                count++;
            }
            return -1;


        }

        public void addAtHead(int val) {
            ListNode node = new ListNode(val);
            node.next = virtualHead.next;
            virtualHead.next = node;
            length++;

        }

        public void addAtTail(int val) {

            ListNode head = virtualHead.next;
            if (head == null) {
                head = new ListNode(val);
                virtualHead.next = head;
            } else {
                while (head.next != null) {
                    head = head.next;
                }
                head.next = new ListNode(val);
            }
            length++;


        }

        public void addAtIndex(int index, int val) {
            if (index <= 0) {
                addAtHead(val);
            } else if (index == length) {
                addAtTail(val);
            } else if (index > length) {
                //ignore
            } else {
                // 1->2->3
                //长度为3， addAtIndex(2,5),在第二个之前插入,变成 1->2->5->3

                int count = 0;
                ListNode head = virtualHead.next;
                while (count < index - 1) {
                    head = head.next;
                    count++;
                }

                ListNode tmp = new ListNode(val);
                tmp.next = head.next;
                head.next = tmp;
                length++;

            }
        }


        // 1->2->3
        //长度为3， deleteAtIndex(1);    // 现在，链表变为 1->3

        public void deleteAtIndex(int index) {
            if (index < 0 || index >= length) {
                return;
            }


            if (length == 1) {
                length--;
                virtualHead.next = null;
                return;
            }
            if (index == 0) {
                virtualHead.next = virtualHead.next.next;
                length--;
                return;
            }

            int count = 1;
            ListNode head = virtualHead.next;
            while (count < index) {
                head = head.next;
                count++;
            }
            head.next = head.next.next;
            length--;

        }
    }
}
