package com.huangyuanlove.leetcode;

public class NumberOfSegmentsInAString_434 {
    public static void main(String[] args) {

        System.out.println(countSegments("Hello, my   name is   John   "));

    }

    public static int countSegments(String s) {
        String tmp = s.trim();
        if(tmp.length() ==0){
            return 0;
        }

        int count = 0;
        boolean hasC = false;
        for (int i = 0; i < tmp.length(); i++) {
             char c= tmp.charAt(i);
             if(c != ' '){
                 hasC = true;
             }else{
                 if(hasC){
                     count ++;
                     hasC = false;
                 }
             }
        }
        if(hasC){
            count ++;
        }
        return count;

    }
}
