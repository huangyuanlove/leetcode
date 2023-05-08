package com.huangyuanlove.leetcode;

public class MinimumNumberOfFrogsCroaking_1419 {
    public int minNumberOfFrogs(String croakOfFrogs) {
        if(croakOfFrogs.length() %5 !=0){
            return -1;
        }
        //croak
        int cCount = 0;
        int rCount = 0;
        int oCount =0;
        int aCount = 0;
        int kCount =0;
        int max = 1;
        char[]chars = croakOfFrogs.toCharArray();
        for (char c : chars) {
            if(c == 'c'){
                cCount ++;
            }else if(c == 'r'){
                rCount ++;
                if(rCount > cCount){
                    return -1;
                }
            }else if(c =='o'){
                oCount ++;
                if(oCount > rCount || oCount > cCount){
                    return -1;
                }
            }else if(c =='a'){
                aCount ++;
                if(aCount > oCount || aCount > rCount || aCount > cCount){
                    return -1;
                }
            }else if(c == 'k'){
                kCount ++;

                if(kCount > aCount || kCount > oCount || kCount > rCount || kCount > cCount){
                    return -1;
                }

                if(cCount == rCount && oCount == aCount && kCount == rCount && kCount ==aCount){

                }else{
                    max = Math.max(Math.max(Math.max(Math.max(Math.max(cCount,max),oCount),rCount),aCount),kCount);
                    cCount--;
                    rCount--;
                    oCount --;
                    aCount --;
                    kCount --;
                }


            }
        }
        if(cCount == rCount && oCount == aCount && kCount == rCount && kCount ==aCount){
            return max;
        }
        return  -1;


    }
}
