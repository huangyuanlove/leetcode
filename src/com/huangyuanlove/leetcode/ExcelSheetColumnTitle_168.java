package com.huangyuanlove.leetcode;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ExcelSheetColumnTitle_168 {
    public static void main(String[] args) {
        System.out.println('A' -0);
        System.out.println('Z' -0);
        System.out.println(convertToTitle(53));

    }
    public static String convertToTitle(int columnNumber) {
        String result = "";


        while(columnNumber>0)
        {
            int current=(columnNumber-1)%26;
            columnNumber=(columnNumber-1)/26;
            char character =  (char)('A' + current);
            result=character+result;
        }
        return result;

    }

}
