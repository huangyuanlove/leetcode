package com.huangyuanlove.leetcode;

public class NimGame_292 {
    public static void main(String[] args) {

    }
    public boolean canWinNim(int n) {
        if(n<=3){
            return true;
        }
        return !(n%4 ==0);
    }
}
