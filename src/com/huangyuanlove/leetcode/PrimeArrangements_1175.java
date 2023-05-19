package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

public class PrimeArrangements_1175 {
    public static void main(String[] args) {
        System.out.println(numPrimeArrangements(100));
        System.out.println(Double.MAX_VALUE > Long.MAX_VALUE);
    }

    public static int numPrimeArrangements(int n) {
        int count[]=new int[]{0, 0, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5, 5, 6, 6, 6, 6, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 13, 13, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 17, 17, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 20, 20, 21, 21, 21, 21, 21, 21, 22, 22, 22, 22, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 24, 24, 25, 25, 25};

        int primeCount = count[n-1];
        int notPrimeCount = n - primeCount;
        long result = 1;
        for (int i = 1; i <=primeCount ; i++) {
            result = result * i % 1000000007;
        }

        for (int i = 1; i <=notPrimeCount ; i++) {
            result = result * i % 1000000007;
        }

        return(int) result;

    }

}
