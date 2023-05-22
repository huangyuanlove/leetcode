package com.huangyuanlove.leetcode;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DayOfTheYear_1154 {
    public static void main(String[] args) {
        System.out.println(dayOfYear("2019-02-10"));
        int dayOfMonth[] = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;
        for (int i = 0; i < dayOfMonth.length; i++) {
            sum += dayOfMonth[i];
            System.out.print(sum + ", ");
        }

    }

    public static int dayOfYear(String date) {
        String[] dateStr = date.split("-");
        int dayOfMonth[] = new int[]{0,31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
        int year = Integer.parseInt(dateStr[0]);
        int month = Integer.parseInt(dateStr[1]);
        int day = Integer.parseInt(dateStr[2]);
        boolean leapYear = false;
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                leapYear = true;
            }
        } else if (year % 4 == 0) {
            leapYear = true;
        }


        day += dayOfMonth[month - 1];

        if (leapYear && month > 2) {
            day++;
        }
        return day;


    }
}
