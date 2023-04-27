package com.huangyuanlove.leetcode;

import java.util.HashSet;

public class UniqueEmailAddresses_929 {
    public static void main(String[] args) {
        String[]emails= new String[]{"alice.z@leetcode.com","alicez@leetcode.com","m.y+name@email.com","my@email.com"};
        int result = new UniqueEmailAddresses_929().numUniqueEmails(emails);
    }

    //"alice.z@leetcode.com” 和 “alicez@leetcode.com”
    //m.y+name@email.com 将转发到 my@email.com。
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (String s : emails) {
            char[] sChars = s.toCharArray();
            boolean afterAt = false;
            boolean isPlush = false;
            for (int i = 0; i < sChars.length; i++) {
                if(sChars[i] == '@'){
                    sb.append('@');
                    afterAt = true;
                }else if(sChars[i] =='.'){
                    if(afterAt){
                        sb.append(".");
                    }
                }else if(sChars[i] =='+'){
                    isPlush =true;
                }else {
                    if(!isPlush){
                        sb.append(sChars[i]);
                    }else {
                        if(afterAt){
                            sb.append(sChars[i]);
                        }
                    }
                }

            }
            set.add(sb.toString());
            sb.delete(0,sb.length());


        }


        return  set.size();


    }
}
