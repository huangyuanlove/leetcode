package com.huangyuanlove.leetcode;

public class MergeSortedArray_88 {

    public static void main(String[] args) {
        int[] num1 = new int[]{2, 0};
        int[] num2 = new int[]{1};
        merge(num1, 1, num2, 1);
        printArray(num1);
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + "  ");
        }
        System.out.println();
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }


        int last = m + n - 1;
        m--;
        n--;
        for (; n >= 0; ) {
            if (m < 0 || nums2[n] >= nums1[m]) {
                nums1[last] = nums2[n];
                n--;
            } else {
                nums1[last] = nums1[m];
                m--;
            }
            last--;
        }


    }
}
