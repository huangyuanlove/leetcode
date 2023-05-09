package com.huangyuanlove.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters_1002 {
    public static void main(String[] args) {
        String[] words = new String[]{"bella","label","roller"};
        System.out.println(new FindCommonCharacters_1002().commonChars(words));
    }

    public List<String> commonChars(String[] words) {
        String base = words[0];
        List<String> result = new ArrayList<>();
        if(words.length == 1){

            for(int i = 0;i<base.length();i++){
                result.add(base.charAt(i)+"");
            }
            return result;
        }

        for (int i = 0; i < base.length(); i++) {
            boolean all = true;
            //base[i] 在字符串中出现的位置
            char baseChar = base.charAt(i);
            for (int j = 1; j < words.length; j++) {

                int index = words[j].indexOf(baseChar);
                if(index == -1){
                    all = false;
                    break;
                }else{
                    words[j] = words[j].replaceFirst(String.valueOf(baseChar),"");
                }

            }
            if(all){
                result.add(baseChar+"");
            }

        }


        return result;
    }
}
