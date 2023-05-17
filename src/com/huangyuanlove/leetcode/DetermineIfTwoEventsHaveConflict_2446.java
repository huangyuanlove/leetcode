package com.huangyuanlove.leetcode;

public class DetermineIfTwoEventsHaveConflict_2446 {
    public static void main(String[] args) {
        System.out.println("01:00".compareTo("02:00"));

    }
    public boolean haveConflict(String[] event1, String[] event2) {
        if(event1[0].compareTo(event2[0]) > 0){
            String[] temp = event1;
            event1 = event2;
            event2 = temp;
        }

        if(event1[1].compareTo(event2[0]) >= 0){
            return true;
        }
        return false;
    }
}
