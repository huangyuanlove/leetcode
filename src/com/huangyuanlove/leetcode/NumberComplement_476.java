package com.huangyuanlove.leetcode;

public class NumberComplement_476 {
    public static void main(String[] args) {
        System.out.println(findComplement(5));

    }
    public static int findComplement(int num) {

        int power = 0;

        for (int i = 0; i <num; i++) {
            if(Math.pow(2,i) <= num && Math.pow(2,i+1) > num){
                power =i;
                break;
            }

        }
        return (int) (Math.pow(2,power+1)-1) ^ num;


    }
}
