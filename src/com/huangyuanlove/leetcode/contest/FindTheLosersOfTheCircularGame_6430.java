package com.huangyuanlove.leetcode.contest;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class FindTheLosersOfTheCircularGame_6430 {
    public static void main(String[] args) {
        int result[] = new FindTheLosersOfTheCircularGame_6430().circularGameLosers(4,4);
        ArrayListHelper.printList(result);
    }

    public int[] circularGameLosers(int n, int k) {
        HashSet<Integer> init = new HashSet<>(n);
        for (int i = 2; i <= n; i++) {
            init.add(i);
        }
        HashSet<Integer> receive = new HashSet<>();
        receive.add(1);
        int step = 1;
        int current = 1;
        while (true) {
           int result = (step*k + current) %n;
           if(result == 0){
             if(receive.add(n)){
                 init.remove(n);
                 current =n;
             }else{
                 break;
             }
           }else{
               if(receive.add(result)){
                   init.remove(result);
                   current = result;
               }else{
                   break;
               }
           }
           step ++;

        }
        int tmp[] = new int[init.size()];
        int i = 0;
       Iterator<Integer> iterator = init.iterator();
        while ( iterator.hasNext()){
            tmp[i] = iterator.next();
            i++;
        }
        Arrays.sort(tmp);
        return tmp;



    }
}
