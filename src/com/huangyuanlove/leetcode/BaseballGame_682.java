package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

import java.util.ArrayList;

public class BaseballGame_682 {
    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5","2","C","D","+"}));
        System.out.println(calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));
    }
    public static int calPoints(String[] operations) {
        ArrayList<Integer> score = new ArrayList<>();
        int head = 0;
        int preHead = 0;
        int sum =0;
        for (int i = 0; i < operations.length; i++) {
            if(operations[i].equals("C")){
                score.remove(score.size() -1);

            }else if(operations[i].equals("D")){
                score.add(score.get(score.size()-1) *2);
                sum += head*2;
                preHead = head;
                head += head;

            }else if(operations[i].equals("+")){
                score.add(score.get(score.size()-1) + score.get(score.size()-2));
                int tmp = head + preHead;
                sum += tmp;
                preHead = head;
                head = tmp;

            }else{
                score.add(Integer.valueOf(operations[i]));
                preHead = head;
                head = Integer.valueOf(operations[i]);
                sum  +=head;
            }

        }
        ArrayListHelper.printList(score);

        for (int i = 0; i < score.size(); i++) {
            sum += score.get(i);
        }

        return sum;


    }
}
