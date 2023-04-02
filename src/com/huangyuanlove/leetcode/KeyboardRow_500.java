package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

import java.util.ArrayList;

public class KeyboardRow_500 {
    public static void main(String[] args) {
        String[] result = findWords(new String[]{"Hello","Alaska","Dad","Peace"});
        ArrayListHelper.printList(result);
    }

    public static String[] findWords(String[] words) {
        ArrayList<String> result = new ArrayList<>();
        String one = "qwertyuiopQWERTYUIOP";
        String two = "asdfghjklASDFGHJKL";
        String three = "zxcvbnmZXCVBNM";

        String guest = null;
        for (String word : words) {
            if (one.contains(word.charAt(0) + "")) {
                guest = one;
            } else if (two.contains(word.charAt(0) + "")) {
                guest = two;
            } else if (three.contains(word.charAt(0) + "")) {
                guest = three;
            }

            if (guest != null) {
                boolean add = true;
                for (int i = 1; i < word.length(); i++) {
                    if(!guest.contains(word.charAt(i)+"")){
                        add = false;
                        break;
                    }
                }
                if(add){
                    result.add(word);
                }
            }
        }

        return result.toArray(new String[0]);


    }
}
