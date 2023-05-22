package com.huangyuanlove.leetcode;

public class DistanceBetweenBusStops_1184 {
    public static void main(String[] args) {
        System.out.println(distanceBetweenBusStops(new int[]{1,2,3,4,5,6,7,8},2,6));
    }

    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if(start == destination){
            return 0;
        }
        int clockwise = 0;
        int counterclockwise = 0;
        //是否到最大的下标
        if(start > destination){
            int tmp = start;
            start = destination;
            destination = tmp;
        }
        for (int i = start; i < destination; i++) {
            clockwise += distance[i];
        }
        for (int i = destination; i < distance.length; i++) {
            counterclockwise+= distance[i];
        }
        for (int i = start-1; i >=0; i--) {
            counterclockwise+= distance[i];
        }

        System.out.println(clockwise +"  " + counterclockwise);

        if(clockwise < counterclockwise){
            return clockwise;
        }
        return counterclockwise;



    }
}
