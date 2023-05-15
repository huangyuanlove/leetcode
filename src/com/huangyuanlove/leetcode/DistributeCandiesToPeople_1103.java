package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

public class DistributeCandiesToPeople_1103 {
    public static void main(String[] args) {
        distributeCandies(9,1);
    }

    public static int[] distributeCandies(int candies, int num_people) {
        //计算可以分几次

        int[] result = new int[num_people];
        int n = 0;
        while (candies >0){
            if(n >= candies){
                result[n % num_people] += candies;
                candies =0;
            }else{
                result[n % num_people] += n+1;
                candies -=(n+1);
            }
            n++;
            ArrayListHelper.printList(result);

        }

        return result;

    }
}
