package com.huangyuanlove.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers_728 {
    public static void main(String[] args) {

    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (is(i)) {
                result.add(i);
            }
        }
        return result;


    }

    public boolean is(int num) {
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0 || num % digit != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }


}
