package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

public class ReplaceElementsWithGreatestElementOnRightSide_1299 {


    public static void main(String[] args) {

        ArrayListHelper.printList(replaceElements(new int[]{17,18,5,4,6,1}));
        ArrayListHelper.printList(replaceElements(new int[]{400}));

    }

    public static int[] replaceElements(int[] arr) {
        int currentMax = -1;
        for (int i = arr.length-1; i >=0 ; i--) {

            if(arr[i] > currentMax){
                int tmp = currentMax;
                currentMax = arr[i];
                arr[i] = tmp;
            }else{
                arr[i] =currentMax;

            }


        }
        return arr;

    }

}
