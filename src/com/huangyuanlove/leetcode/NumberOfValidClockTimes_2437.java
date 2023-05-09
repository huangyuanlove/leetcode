package com.huangyuanlove.leetcode;

public class NumberOfValidClockTimes_2437 {
    public static void main(String[] args) {

    }

    public int countTime(String time) {
        int h = 1;
        int m = 1;
        String[] s = time.split(":");
        switch (s[0]) {
            case "??":
                h = 23;
                break;
            case "?0":
            case "?1":
            case "?2":
            case "?3":
                h = 2;
                break;
            case "?4":
            case "?5":
            case "?6":
            case "?7":
            case "?8":
            case "?9":
                h = 1;
                break;
            case "0?":
            case "1?":
                h = 9;
                break;
            case "2?":
                h = 3;
                break;
        }

        switch (s[1]) {
            case "??":
                m = 59;
                break;
            case "?0":
            case "?1":
            case "?3":
            case "?2":
            case "?4":
            case "?5":
            case "?6":
            case "?7":
            case "?8":
            case "?9":
                m = 5;
                break;
            case "0?":
            case "1?":
            case "2?":
            case "3?":
            case "4?":
            case "5?":
                m = 9;
                break;
        }


        return (h+1) * (m+1);

    }
}
