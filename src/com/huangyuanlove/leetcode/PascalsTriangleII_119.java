package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII_119 {

    public static void main(String[] args) {
            List<Integer> result = getRow(0);
        ArrayListHelper.printList(result);
        System.out.println("1\t9\t36\t84\t126\t126\t84\t36\t9\t1\t");
        Integer.reverse()
    }

    public static List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> result = new ArrayList<>(rowIndex);
        long current = 1;
        for (int i = 0; i <= rowIndex; i++) {
            result.add((int)current);
            current = current *(rowIndex -i)/(i+1);

        }
        return result;

    }
}
