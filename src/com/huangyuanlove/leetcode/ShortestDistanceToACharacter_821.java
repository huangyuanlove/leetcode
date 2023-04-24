package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

public class ShortestDistanceToACharacter_821 {
    public static void main(String[] args) {
int result[] = shortestToChar("loveleetcode",'e');
        ArrayListHelper.printList(result);
    }

    public static int[] shortestToChar(String s, char c) {
        char[] sChars = s.toCharArray();
        int[]result = new int[sChars.length];

        for (int i = 0; i < sChars.length; i++) {
            if(sChars[i] == c){
                //向左查找，直到i=0 或者 sChars[i] =c;
                result[i] = 0;
                int j = i-1;
                while (j>=0 && sChars[j]!=c){
                    if(result[j]>i-j || result[j] ==0){
                        result[j] = i-j;
                    }else{
                        break;
                    }
                    j--;
                }
                //向右查找，直到i=sChar.length 或者 sChars[i] =c
                j = i+1;
                while (j<sChars.length && sChars[j]!=c){
                    if(result[j]>j-i || result[j] ==0){
                        result[j] = j-i;
                    }else {
                        break;
                    }
                    j++;
                }


            }
        }
        return result;
    }
}
