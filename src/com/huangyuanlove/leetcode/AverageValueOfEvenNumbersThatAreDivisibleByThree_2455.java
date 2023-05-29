package com.huangyuanlove.leetcode;

public class AverageValueOfEvenNumbersThatAreDivisibleByThree_2455 {
    public static void main(String[] args) {

    }

    public int averageValue(int[] nums) {
        int count =0;
        int sum =0;
        for (int num :
                nums) {
            if (num % 3 == 0 && (num &1)==0 ) {
                sum += num;
                count ++;
            }
        }
        if(count == 0){
            return 0;
        }
        return sum / count;

    }
}
