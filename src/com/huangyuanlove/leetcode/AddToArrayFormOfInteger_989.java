package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddToArrayFormOfInteger_989 {
    public static void main(String[] args) {
      List<Integer> result =  new AddToArrayFormOfInteger_989().addToArrayForm(new int[]{0},23);
        ArrayListHelper.printList(result);


    }

    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int kl = String.valueOf(k).length();
        int needPlush = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            int tmp = num[i] + k % 10 + needPlush;
            if (tmp > 9) {
                result.add(tmp - 10);
                needPlush = 1;
            } else {
                result.add(tmp);
                needPlush = 0;
            }
            k /= 10;
        }
        if(kl <= num.length){
            if(needPlush == 1){
                result.add(1);
            }
        }else{
            while (k>0){
                int tmp = k%10 + needPlush;
                if(tmp>9){
                    result.add(0);
                    needPlush = 1;
                }else{
                    result.add(tmp);
                    needPlush = 0;
                }
                k/=10;
            }
            if(needPlush ==1){
                result.add(1);
            }
        }

        for (int i = 0; i < result.size()/2; i++) {
            int tmp = result.get(i);
            result.set(i,result.get(result.size()-i-1));
            result.set(result.size()-i-1,tmp);
        }
        return result;
    }
}
