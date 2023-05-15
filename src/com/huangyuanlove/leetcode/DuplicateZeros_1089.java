package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class DuplicateZeros_1089 {
    public static void main(String[] args) {
        int []testCase = new int[]{1,0,2,3,0,4,5,0};
        new DuplicateZeros_1089().duplicateZeros(testCase);
        ArrayListHelper.printList(testCase);
    }

    /**
     * 输入：arr = [1,0,2,3,0,4,5,0]
     * 输出：[1,0,0,2,3,0,0,4]
     */
    public void duplicateZeros(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            if(queue.isEmpty()){
                if(arr[i] !=0){
                    continue;
                }else{
                    if(i+1 < arr.length){
                        queue.add(arr[i+1]);
                        arr[i+1] = 0;
                        i++;
                    }
                }
            }else{
                queue.add(arr[i]);
                arr[i] = queue.poll();
                if(arr[i] ==0){
                    if(i+1 < arr.length){
                        queue.add(arr[i+1]);
                        arr[i+1] = 0;
                        i++;
                    }
                }


            }

        }

    }
}
