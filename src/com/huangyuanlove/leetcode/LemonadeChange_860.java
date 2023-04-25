package com.huangyuanlove.leetcode;

import java.util.HashMap;

public class LemonadeChange_860 {
    public static void main(String[] args) {

    }

    public boolean lemonadeChange(int[] bills) {
        int fiveCount = 0;
        int tenCount = 0;

        for (int i = 0; i < bills.length; i++) {
            //先收钱
            if(bills[i] == 5){
                fiveCount ++;
            }else if(bills[i] == 10){
                tenCount ++;
                //找零5元
                if(fiveCount>0){
                    fiveCount --;
                }else{
                    return false;
                }
            }else{

                //找零15；
                //10 + 5 or 5+5+5
                if(tenCount >0){
                    if(fiveCount>0){
                        fiveCount --;
                        tenCount --;
                    }else{
                        return false;
                    }
                }else{
                    if(fiveCount >=3){
                        fiveCount -=3;
                    }else{
                        return false;
                    }
                }

            }
        }
        return true;
    }
}
