package com.huangyuanlove.leetcode;

public class FirstBadVersion_278 {

    private static int badVersion = 1702766719;

    public static void main(String[] args) {
        System.out.println(firstBadVersion(2126753390
        ));
    }

    public static int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return high;
    }

    public static boolean isBadVersion(int n) {

        return n >= badVersion;

    }
}
