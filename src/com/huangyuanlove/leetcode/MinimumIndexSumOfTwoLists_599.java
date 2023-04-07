package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

import java.util.ArrayList;
import java.util.HashMap;

public class MinimumIndexSumOfTwoLists_599 {
    public static void main(String[] args) {
        String[] result = findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"});
        ArrayListHelper.printList(result);
    }

    public static  String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i],i);
        }
        int min = list1.length + list2.length;
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < list2.length; i++) {
            if(map.containsKey(list2[i])){
                int tmp = map.get(list2[i]) + i;
                System.out.println(tmp +"  " + min);
                if(min > tmp){
                    min =tmp;
                    result.clear();
                    result.add(list2[i]);
                }else if(min == tmp){
                    result.add(list2[i]);
                }else{
                    if(result.size() ==0){
                        result.add(list2[i]);
                    }

                }
            }
        }
        return result.toArray(new String[0]);

    }
}
