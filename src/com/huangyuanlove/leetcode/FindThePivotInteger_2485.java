package com.huangyuanlove.leetcode;

public class FindThePivotInteger_2485 {
    public static void main(String[] args) {
        System.out.println(pivotInteger(15));
    }

    public static int pivotInteger(int n) {
        if(n == 1){
            return 1;
        }

        int start = 1;
        int end = n;
        int preSum = start;
        int endSum = end;
        while (start < end){
            if(preSum < endSum){
                start ++;
                preSum += start;
            }else if(preSum > endSum){
                end --;
                endSum +=end;
            }else{
                if(end -start == 2){
                    return end-1;
                }else{
                    end --;
                    endSum += end;
                }
            }



        }
        return -1;


    }
}
