package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class NextGreaterElementI_496 {
    public static void main(String[] args) {
        int []result = nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2});
        ArrayListHelper.printList(result);
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>(nums1.length);
        for (int i = 0; i < nums1.length; i++) {
            int current = nums1[i];
            int start = -1;
            boolean has = false;
            for (int j = 0; j < nums2.length; j++) {
                if(j>start && current < nums2[j] && start >=0){
                    result.add(nums2[j]);
                    has = true;
                    break;
                }
                if(current == nums2[j]){
                    System.out.println("找到-->" + j);
                    start = j;
                }


            }
            if(!has){
                result.add(-1);
            }

        }


        return result.stream().mapToInt(new ToIntFunction<Integer>() {
            @Override
            public int applyAsInt(Integer integer) {
                return integer;
            }
        }).toArray();

    }
    public static  int[] nextGreaterElement2(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums2.length - 1; i++) {
           if(stack.isEmpty()){
               stack.add(nums2[i]);
           }else{
             while (!stack.isEmpty() && stack.peek()< nums2[i]){
                 int stackTop = stack.pop();
                 hashMap.put(stackTop,nums2[i]);
             }
             stack.add(nums2[i]);
           }
        }
        while (!stack.isEmpty()&& stack.peek()< nums2[nums2.length-1]){
            hashMap.put(stack.pop(),nums2[nums2.length-1]);
        }

        ArrayList<Integer> result = new ArrayList<>(nums1.length);
        for (int i = 0; i < nums1.length; i++) {

            Integer next = hashMap.get(nums1[i]);
            if(next==null){
                result.add(-1);
            }else {
                result.add(next);
            }

        }
        return result.stream().mapToInt(new ToIntFunction<Integer>() {
            @Override
            public int applyAsInt(Integer integer) {
                return integer;
            }
        }).toArray();


    }
}
