package com.huangyuanlove.leetcode.contest;

public class NumberOfSeniorCitizens_6366 {
    public static void main(String[] args) {
        System.out.println(new NumberOfSeniorCitizens_6366().countSeniors(new String[]{"7868190130M7522","5303914400F9211","9273338290F4010"}));
    }

    public int countSeniors(String[] details) {

        int count = 0;
        for (String detail : details) {
            int age = (detail.charAt(11)-'0') * 10 + (detail.charAt(12)-'0');
            if(age>60){
                count ++;
            }
        }
        return count;

    }

}
