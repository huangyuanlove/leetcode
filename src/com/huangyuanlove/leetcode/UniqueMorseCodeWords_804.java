package com.huangyuanlove.leetcode;

import java.util.HashSet;

public class UniqueMorseCodeWords_804 {
    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        if(words.length == 1){
            return  1;
        }
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> result = new HashSet<>();
        for (String word : words) {
            StringBuilder stringBuffer = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                stringBuffer.append( morse[word.charAt(i) -'a'] );
            }
            result.add(stringBuffer.toString());

        }


        return result.size();


    }
}
