package com.huangyuanlove.leetcode.contest;

public class LexicographicallySmallestStringAfterSubstringOperation_6465 {
    public static void main(String[] args) {
        System.out.println(smallestString("aaa"));
        System.out.println(smallestString("cbabc"));
        System.out.println(smallestString("acbbc"));
        System.out.println(smallestString("leetcode"));
    }
    public static String smallestString(String s) {
        char[] chars = s.toCharArray();
        if(chars.length ==1){
            if(chars[0] =='a'){
                chars[0] ='z';
            }else{
                chars[0] -=1;
            }
            return new String(chars);
        }
        //如果以a开始，则从第二位开始；否则从第一个开始
        int start = 0;
        if(chars[0] =='a'){
            start = 1;
        }
        boolean hasChange = false;
        for (int i = start; i < chars.length; i++) {
            if(chars[i]!='a' || !hasChange){

                if(i == chars.length-1){
                    if(chars[i]=='a'){
                        chars[i] ='z';
                    }else{
                        chars[i]-=1;
                    }
                }else{
                    if(chars[i]=='a'){
                        continue;
                    }else{
                        chars[i]-=1;
                    }
                }
                hasChange = true;
            }else{
                break;
            }
        }
        return new String(chars);

    }
}
