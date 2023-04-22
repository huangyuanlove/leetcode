package com.huangyuanlove.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class GoatLatin_824 {
    public static void main(String[] args) {
        System.out.println(toGoatLatin("I speak Goat Latin"));
    }

    public static String toGoatLatin(String sentence) {

        String [] sentences = sentence.split(" ");
        Character[] temp = new Character[] {'a', 'e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U'};
        HashSet<Character> set = new HashSet<>(Arrays.asList(temp));
        StringBuilder result = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < sentences.length; i++) {


            String current = sentences[i];
            char first = current.charAt(0);
            currentWord.append(current);
            if(set.contains(first)){
                currentWord.append("ma");

            }else{
                currentWord.delete(0,1).append(first).append("ma");
            }
            for (int j = 0; j <= i; j++) {
                currentWord.append("a");
            }


            result.append(currentWord);
            if(i!= sentences.length -1){
                result.append(" ");
            }
            currentWord.delete(0,currentWord.length());
        }
        return result.toString();
    }
}
