package com.huangyuanlove.leetcode;

import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray_697 {

    public static void main(String[] args) {
        System.out.println(findShortestSubArray(new int[]{1,2}));
    }

    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer,Recorder> countMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(countMap.containsKey(nums[i])){
                Recorder temp = countMap.get(nums[i]);
                temp.count++;
                temp.distance = i-temp.start +1;
            }else{
                Recorder temp = new Recorder();
                temp.count = 1;
                temp.start = i;
                countMap.put(nums[i],temp);
            }
        }

        int maxCount = -1;
        int minDistance = 50001;
        for (Map.Entry<Integer, Recorder> entry : countMap.entrySet()) {
                Recorder recorder = entry.getValue();
                if(recorder.count == maxCount){
                    if(minDistance > recorder.distance){
                        minDistance = recorder.distance;

                    }
                }else if(recorder.count > maxCount){
                    minDistance = recorder.distance;
                    maxCount = recorder.count;
                }
        }
        return minDistance;




    }

  static  class Recorder{
       public int count=0;
        public  int start =-1;
        public int distance = 1;
    }
}
