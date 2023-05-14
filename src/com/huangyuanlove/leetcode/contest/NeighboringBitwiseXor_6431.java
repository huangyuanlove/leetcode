package com.huangyuanlove.leetcode.contest;

public class NeighboringBitwiseXor_6431 {
    public static void main(String[] args) {
        System.out.println(new NeighboringBitwiseXor_6431().doesValidArrayExist(new int[]{1,1,0}));
        System.out.println(new NeighboringBitwiseXor_6431().doesValidArrayExist(new int[]{1,1}));
        System.out.println(new NeighboringBitwiseXor_6431().doesValidArrayExist(new int[]{1,0}));
    }

    public boolean doesValidArrayExist(int[] derived) {
        boolean isOne =true;
        for (int i = 0; i < derived.length; i++) {
            if(derived[i] == 0){

            }else{
                isOne = !isOne;
            }
        }
        return isOne;


    }
}
