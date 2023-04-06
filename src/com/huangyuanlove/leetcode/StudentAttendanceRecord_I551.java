package com.huangyuanlove.leetcode;

public class StudentAttendanceRecord_I551 {
    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLL"));
    }

    /**
     * 'A'：Absent，缺勤
     * 'L'：Late，迟到
     * 'P'：Present，到场
     */
    public static boolean checkRecord(String s) {
        if (s.length() == 1) {
            return true;
        }
        int aCount = 0;
        int lateCount = 0;
        boolean result = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                aCount++;
                if (aCount >= 2) {
                    result = false;
                    break;
                }
            }
            if (c == 'L') {
                lateCount++;
                if (lateCount >= 3) {
                    result = false;
                    break;
                }
            } else {
                lateCount = 0;

            }


        }

        return result;
    }
}
