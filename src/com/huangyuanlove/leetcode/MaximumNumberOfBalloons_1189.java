package com.huangyuanlove.leetcode;

public class MaximumNumberOfBalloons_1189 {
    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));
    }

    public static int maxNumberOfBalloons(String text) {
        double bCount =0;
        double aCount =0;
        double lCount = 0;
        double oCount =0;
        double nCount =0;
        char[]chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]  =='b'){
                bCount ++;
            }else if(chars[i]  == 'a'){
                aCount ++;
            }else if(chars[i] =='l'){
                lCount+=0.5;
            }else if(chars[i] =='o'){
                oCount +=0.5;
            }
            else if(chars[i] =='n'){
                nCount ++;
            }
        }
        Double result = bCount;
        if(result > aCount){
            result = aCount;
        }
        if(result > lCount){
            result = lCount;
        }
        if(result > oCount){
            result = oCount;
        }
        if(result > nCount){
            result = nCount;
        }
        return result.intValue();



    }
}
