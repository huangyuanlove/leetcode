package com.huangyuanlove.leetcode;

public class GenerateAStringWithCharactersThatHaveOddCounts_1374 {
    public static void main(String[] args) {

    }

    public String generateTheString(int n) {

        if(n == 1){
            return "a";
        }
        if(n == 2){
            return "ab";
        }
        if(n ==3){
            return "abc";
        }
        StringBuilder stringBuffer = new StringBuilder();

        if( (n&1) ==0) {
            //偶数
            // n-1 个 a  和 一个 b
            for (int i = 0; i < n-1; i++) {
                stringBuffer.append('a');
            }
            stringBuffer.append('b');

        }else{
            // n-2 个 a 和一个b 一个c
            for (int i = 0; i < n-2; i++) {
                stringBuffer.append('a');
            }
            stringBuffer.append('b');
            stringBuffer.append('c');
        }
        return stringBuffer.toString();
    }
}
