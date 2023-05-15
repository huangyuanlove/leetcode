package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

import java.util.ArrayList;

public class OccurrencesAfterBigram_1078 {
    public static void main(String[] args) {
    ArrayListHelper.printList(new OccurrencesAfterBigram_1078().findOcurrences("we will we will rock you","we","will"));
    }

    public String[] findOcurrences(String text, String first, String second) {
        ArrayList<String> result = new ArrayList<>();

        String []textArray = text.split(" ");
        for (int i = 0; i < textArray.length-1; i++) {
            if(textArray[i].equals(first) && textArray[i+1].equals(second)){
                if(i+2 <textArray.length){
                    result.add(textArray[i+2]);
                }
            }
        }

        return result.toArray(new String[0]);
    }
}
