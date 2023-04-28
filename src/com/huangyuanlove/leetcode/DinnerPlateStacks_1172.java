package com.huangyuanlove.leetcode;

import java.util.*;

public class DinnerPlateStacks_1172 {
    public static void main(String[] args) {
        DinnerPlates obj = new DinnerPlates(2);
        System.out.println("null");
        obj.push(1);
        System.out.println("null");
        obj.push(2);
        System.out.println("null");
        obj.push(3);
        System.out.println("null");
        obj.push(4);
        System.out.println("null");
        obj.push(5);
        System.out.println("null");
        System.out.println(obj.popAtStack(0));
        obj.push(20);
        System.out.println("null");
        obj.push(21);
        System.out.println("null");
        System.out.println(obj.popAtStack(0));
        System.out.println(obj.popAtStack(2));
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());

    }


    static class DinnerPlates {

        // key是索引，value是栈
        HashMap<Integer, LinkedList<Integer>> map = new HashMap<>();
        // 记录从左往右第一个未满的栈
        TreeSet<Integer> firstNotFull = new TreeSet<>();
        // 记录从右往左第一个非空栈
        TreeSet<Integer> firstNotEmpty = new TreeSet<>((a, b)->{
            return b - a;
        });

        int maxIndex = 0; // 当前最大的栈编号
        int capacity;

        public DinnerPlates(int capacity) {
            this.capacity = capacity;
            firstNotFull.add(0);
        }

        public void push(int val) {
            // 取到最小未满栈下标
            int index = firstNotFull.pollFirst();
            LinkedList<Integer> stack = map.getOrDefault(index, new LinkedList<>());
            stack.add(val);

            // 更新map
            map.put(index, stack);
            // push之后未满，放回去继续用
            if(stack.size() < capacity){
                firstNotFull.add(index);
            }
            // 现有栈都满了
            else if(firstNotFull.isEmpty()){
                // 最大编号加一，放入未满队列中备用
                firstNotFull.add(++maxIndex);
            }

            // 保存非空栈下标
            if(!firstNotEmpty.contains(index)){
                firstNotEmpty.add(index);
            }
        }

        public int pop() {
            if(firstNotEmpty.isEmpty()){
                // 现有栈都空
                return -1;
            }else{
                // 获取最大非空栈下标
                int index = firstNotEmpty.pollFirst();
                LinkedList<Integer> stack = map.get(index);
                int res = stack.pollLast();
                if(stack.size() > 0){
                    firstNotEmpty.add(index);
                }

                firstNotFull.add(index);
                return res;
            }
        }

        public int popAtStack(int index) {
            LinkedList<Integer> stack = map.getOrDefault(index, new LinkedList<>());
            if(stack.size() == 0){
                return -1;
            }else{
                int res = stack.pollLast();

                if(!firstNotFull.contains(index)){
                    firstNotFull.add(index);
                }
                if(stack.size() == 0 && firstNotEmpty.contains(index)){
                    firstNotEmpty.remove(index);
                }

                return res;
            }
        }
    }
}
