package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;

public class ConstructTheRectangle_492 {
    public static void main(String[] args) {

        ArrayListHelper.printList(constructRectangle(5));
    }

    public static int[] constructRectangle(int area) {

       double result = Math.sqrt(area);

       if( ((int)result)* ((int)result) == area){
           return new int[]{(int)result,(int)result};
       }

       int ceil = (int)Math.ceil(result);
       int a[]=new int[2];
        for (int i = ceil; i >0; i--) {
            int width = area/i;

            if(width * i == area){
                a[0] = Math.max(i,width);
                a[1] = Math.min(i,width);
                break;
            }

        }
        return a;

    }
}
