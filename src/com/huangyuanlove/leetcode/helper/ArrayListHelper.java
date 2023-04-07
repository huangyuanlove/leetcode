package com.huangyuanlove.leetcode.helper;

import java.util.List;
import java.util.Objects;

public class ArrayListHelper {

    public static void printList(List list){

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == null){
                System.out.print("null | ");
            }else{
                System.out.print(list.get(i).toString() +" | ");

            }
        }
        System.out.println();
    }
    public static <T>void printList(T [] list){

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i].toString() +" | ");
        }
        System.out.println();
    }
    public static void printList(int [] list){

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] +" | ");
        }
        System.out.println();
    }
}
