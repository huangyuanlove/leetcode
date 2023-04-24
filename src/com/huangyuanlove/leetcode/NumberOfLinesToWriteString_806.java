package com.huangyuanlove.leetcode;

public class NumberOfLinesToWriteString_806 {
    public static void main(String[] args) {

    }

    public int[] numberOfLines(int[] widths, String s) {


        int currentLine = 100;
        int lineCount = 1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(currentLine < widths[c-'a']){
                lineCount ++;
                currentLine = 100 -widths[c-'a'];
            }else{
                currentLine -=widths[c-'a'];
            }
        }
        return new int[]{lineCount,100-currentLine};

    }
}
