package com.huangyuanlove.leetcode;

public class AddStrings_415 {

    public static void main(String[] args) {
        System.out.println(addStrings("999","11"));
    }

    public static String addStrings(String num1, String num2) {
        int plushOne = 0;
        int num1LastIndex = num1.length() - 1;
        int num2LastIndex = num2.length() - 1;
        StringBuilder result = new StringBuilder();
        while (num1LastIndex >= 0 && num2LastIndex >= 0) {
            char firstC = num1.charAt(num1LastIndex);
            char secondC = num2.charAt(num2LastIndex);
            int current = firstC - 48 + secondC -48 + plushOne;
            if(current >=10){
                plushOne = 1;
                result.insert(0,current-10);
            }else{
                plushOne = 0;
                result.insert(0,current);
            }
            num1LastIndex --;
            num2LastIndex --;
        }

        if(num1LastIndex == num2LastIndex){
            if(plushOne == 1){
                result.insert(0,1);
            }
        }else{
            if(num1LastIndex <0){
                while (num2LastIndex >=0){
                    int current = num2.charAt(num2LastIndex) - 48 + plushOne;
                    if(current >= 10){
                        result.insert(0,current - 10);
                        plushOne = 1;
                    }else{
                        result.insert(0,current);
                        plushOne = 0;
                    }

                    num2LastIndex --;
                }
            }else if(num2LastIndex < 0){
                while (num1LastIndex >=0){
                    int current = num1.charAt(num1LastIndex) - 48 + plushOne;
                    if(current >= 10){
                        result.insert(0,current -10);
                        plushOne = 1;
                    }else{
                        result.insert(0,current);
                        plushOne = 0;
                    }
                    num1LastIndex --;
                }
            }
            if(plushOne ==1){
                result.insert(0,1);
            }
        }


        return result.toString();


    }
}
