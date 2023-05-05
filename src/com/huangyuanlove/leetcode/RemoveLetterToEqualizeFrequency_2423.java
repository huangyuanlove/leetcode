package com.huangyuanlove.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RemoveLetterToEqualizeFrequency_2423 {
    public static void main(String[] args) {
//        System.out.println(new RemoveLetterToEqualizeFrequency_2423().equalFrequency("zzzzz"));
//        System.out.println(new RemoveLetterToEqualizeFrequency_2423().equalFrequency("abc"));
//        System.out.println(new RemoveLetterToEqualizeFrequency_2423().equalFrequency("aabbc"));
//        System.out.println(new RemoveLetterToEqualizeFrequency_2423().equalFrequency("accc"));
        System.out.println(new RemoveLetterToEqualizeFrequency_2423().equalFrequency("aacccaaa"));
    }

    public boolean equalFrequency(String word) {
        if (word.length() <= 2) {
            return true;
        }
        int count[] = new int[26];
        char[] wordChars = word.toCharArray();
        for (int i = 0; i < wordChars.length; i++) {
           count[wordChars[i]-'a' ]++;
        }
        int a = 0;
        int aCount = 0;
        int b = 0;
        int bCount = 0;
        for (int i = 0; i < count.length; i++) {
            if(count[i] >0){
                if(a == 0){
                    a = count[i];
                    aCount++;
                }else if(b == 0){
                    b = count[i];
                    bCount++;
                }
                if(count[i]==a){
                    aCount ++;
                }else if(count[i] ==b){
                    bCount ++;
                }
            }

        }
        if (bCount == 0) {
            return a == 1 || aCount == 1;
        }
//  第一个值为1并且第一个值出现次数为1   或者
        //  第二个值为1并且第二个值出现次数为1
        if ((a == 1 && aCount == 1) || b == 1 && bCount == 1) {
            return true;
        }
        // 两个值相差为1并且大的一个值只出现过一次
        return (a - b == 1 && aCount == 1) || (a - b == -1 && bCount == 1);
    }
}
