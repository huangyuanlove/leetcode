package com.huangyuanlove.leetcode;

public class ThousandSeparator_1556 {

    public String thousandSeparator(int n) {
        if(n < 1000){
            return String.valueOf(n);
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (n>0){
            sb.insert(0,n%10);
            n/=10;
            count ++;
            if(count == 3 && n>0){
                sb.insert(0,'.');
                count = 0;
            }
        }
        return sb.toString();
    }
}
