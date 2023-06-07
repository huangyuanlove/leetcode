package com.huangyuanlove.leetcode;

import java.util.HashMap;
import java.util.Map;

public class CountLargestGroup_1399 {
    public static void main(String[] args) {
        System.out.println(countLargestGroup(13));
    }

    public static int countLargestGroup(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {

            int sum = 0;
            int tmp = i;
            while (tmp > 0) {
                sum += tmp % 10;
                tmp /= 10;
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }
        int max = 0;
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > count) {
                max = 1;
                count = entry.getValue();
            } else if (entry.getValue() == count) {
                max++;
            }

        }
        return max;


    }
}
