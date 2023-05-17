package com.huangyuanlove.leetcode;

public class RelativeSortArray_1122 {
    public static void main(String[] args) {

    }
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] nums = new int[1001];
        int[] res = new int[arr1.length];
        int max = 0;
        //遍历arr1,统计每个元素的数量
        for (int i : arr1) {
            nums[i]++;
            max = Math.max(max, i);   //每次都求max，获取arr1的最大值
        }
        //遍历arr2,处理arr2中出现的元素
        int index = 0;
        for (int i : arr2) {
            while (nums[i]>0){
                res[index++] = i;
                nums[i]--;
            }
        }
        //遍历nums,处理剩下arr2中未出现的元素
        for (int i = 0; i <= max; i++) {     //遍历nums可以遍历到max就停下了，不用到1001
            while (nums[i]>0){
                res[index++] = i;
                nums[i]--;
            }
        }
        return res;
    }
}
