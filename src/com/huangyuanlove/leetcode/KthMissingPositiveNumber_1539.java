package com.huangyuanlove.leetcode;

public class KthMissingPositiveNumber_1539 {
    public static void main(String[] args) {

    }

    /**
     * arr = [2,3,4,7,11], k = 5
     * 9
     * arr = [1,2,3,4,6], k = 5
     * 5 7 8 9 10
     */
    public static int findKthPositive(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - i - 1 >= k) {
                return arr[i] - (arr[i] - i - k);
            }
        }
        return k - (arr[arr.length - 1] - arr.length) + arr[arr.length - 1];
    }
}
