package com.huangyuanlove.leetcode;

public class LongPressedName_925 {
    public static void main(String[] args) {

//        "vtkgn"
//        "vttkgnn"

//        System.out.println(isLongPressedName("alex","aaleex"));
        System.out.println(isLongPressedName("vtkgn","vttkgnn"));

    }

    public static boolean isLongPressedName(String name, String typed) {
        if(typed.length() < name.length()){
            return false;
        }
        if(name.equals(typed)){
            return true;
        }
        int typedIndex =0;
        int nameIndex = 0;

        while (typedIndex < typed.length()){

            if(nameIndex<name.length() &&  typed.charAt(typedIndex) == name.charAt(nameIndex)){
                typedIndex++;
                nameIndex++;

            }else if(typedIndex >0 && typed.charAt(typedIndex) == typed.charAt(typedIndex-1)){
                 typedIndex++;

            }else{
                return false;
            }



        }
        return nameIndex == name.length();

    }
}
