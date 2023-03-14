package com.huangyuanlove.leetcode;

public class ExcelSheetColumnNumber_171 {
    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }
    public static int titleToNumber(String columnTitle) {

        int length  = columnTitle.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            int current = columnTitle.charAt(i) - 64;
            result += Math.pow(26,length -i -1) * current;
        }
        return result;


    }
}
