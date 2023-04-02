package com.huangyuanlove.leetcode;

public class TeemoAttacking_495 {
    public static void main(String[] args) {
        System.out.println(findPoisonedDuration(new int[]{1,2},2));
    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        if(duration ==0){
            return 0;
        }
        if(timeSeries==null || timeSeries.length ==0){
            return 0;
        }
        if(timeSeries.length == 1){
            return duration;
        }


        int count = 0;
        for (int i = 0; i < timeSeries.length-1; i++) {
            if(timeSeries[i] +duration -1 <timeSeries[i+1]){
                count+=duration;
            }else{
                count += timeSeries[i+1]-timeSeries[i];
            }


        }
        return  count+duration;
    }
}
