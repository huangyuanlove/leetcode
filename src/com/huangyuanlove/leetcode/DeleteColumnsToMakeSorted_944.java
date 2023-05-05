package com.huangyuanlove.leetcode;

public class DeleteColumnsToMakeSorted_944 {
    public static void main(String[] args) {
        System.out.println(new DeleteColumnsToMakeSorted_944().minDeletionSize(new String[]{"cba","daf","ghi"}));
    }
    public int minDeletionSize(String[] strs) {
        if(strs.length == 1){
            return  0;
        }

        //cba
        //daf
        //ghi

        int count =0;
        //0,0 和 1,0 2,0 3,0 4,0 ... [strs.length-1][0]
        //0,1  1,1  2,1  3,1 4,1 ... [strs.length-1][1]
        //...
        //0,strs[0].lenght-1 1,strs[0].lenght-1  [strs.length-1],strs[0].lenght-1
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length-1; j++) {
                if(strs[j].charAt(i) > strs[j+1].charAt(i)){
                    System.out.println(j +" " +i + " " + strs[j].charAt(i) + " " + strs[j].charAt(i+1));
                    count ++;
                    break;
                }
            }
        }
        return  count;

    }
}
