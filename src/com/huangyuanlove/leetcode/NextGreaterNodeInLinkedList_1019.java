package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;
import com.huangyuanlove.leetcode.helper.ListNode;
import com.huangyuanlove.leetcode.helper.ListNodeHelper;

import java.util.ArrayList;

public class NextGreaterNodeInLinkedList_1019 {
    public static void main(String[] args) {
        ListNode node = ListNodeHelper.createLIstByNumber(new int[]{2,7,4,3,5}) ;
        int []result = nextLargerNodes(node);
        ArrayListHelper.printList(result);
    }

    public static int[] nextLargerNodes(ListNode head) {

        ArrayList<Integer> recorder = new ArrayList<>();
        while (head!=null){
            recorder.add(head.val);
            head = head.next;
        }
        int []result = new int[recorder.size()];
        result[recorder.size()-1] = 0;
        for (int i = recorder.size()-2; i >=0; i--) {
            if(recorder.get(i) < recorder.get(i+1)){
                result[i] = recorder.get(i+1);
            }else{
                for (int j = i+1; j < recorder.size() ; j++) {
                    if(recorder.get(j) > recorder.get(i)){
                        result[i] = recorder.get(j);
                        break;
                    }
                }
            }
        }
        return result;


    }
}
