package com.huangyuanlove.leetcode;

public class ValidMountainArray_941 {
    public static void main(String[] args) {

    }

    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3){
            return false;
        }
        int left = 0;
        int right = arr.length-1;
        while(left < right && arr[left] < arr[left+1]){
            left++;
        }
        while(left < right && arr[right] < arr[right-1]){
            right--;
        }
        return left == right && left != 0 && right != arr.length-1;
    }
}
