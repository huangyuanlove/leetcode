package com.huangyuanlove.leetcode;

public class DayOfTheWeek_1185 {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] weekDays =new String[]{"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
        //1971.1.1 是周五
        int count = 0;
        for (int i = 1971; i <year ; i++) {
            if(i % 400 ==0 || (i%100!=0 && i %4 ==0)  ){
                count += 366;
            }else{
                count +=365;
            }
        }

        int monthDay[]=new int[]{31,  28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        if(year % 400 ==0 || (year%100!=0 && year %4 ==0)  ){
            monthDay[1] = 29;
        }
        for(int i = 1; i < month; i++) {
            count += monthDay[i - 1];
        }

        count = (count + day - 1) % 7;
        return weekDays[count];
    }
}
