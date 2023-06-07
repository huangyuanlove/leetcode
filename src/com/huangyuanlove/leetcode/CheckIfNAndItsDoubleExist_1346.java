package com.huangyuanlove.leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class CheckIfNAndItsDoubleExist_1346 {
    public static void main(String[] args) {
//        System.out.println(checkIfExist(new int[]{ -20,8,-6,-14,0,-19,14,4  }));
        System.out.println(checkIfExist(new int[]{ 7,1,14,11  }));
    }

    public static boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if(set.contains(num*2)){
                return true;
            }else if( (num&1)==0 && set.contains(num/2) ){
                return true;
            }else{
                set.add(num);
            }
        }
        return false;

    }
}
