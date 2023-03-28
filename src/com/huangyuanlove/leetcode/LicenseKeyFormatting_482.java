package com.huangyuanlove.leetcode;

public class LicenseKeyFormatting_482 {
    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("--a-a-a-a--"
                , 2));
    }

    public static String licenseKeyFormatting(String s, int k) {

        StringBuilder stringBuffer = new StringBuilder();
        int count =0;
        for (int i = s.length()-1; i >=0; i--) {

            if(s.charAt(i) !='-'){
                count ++;
                stringBuffer.insert(0,s.charAt(i));
            }
            if(count ==k ){
                count =0;
                stringBuffer.insert(0,'-');
            }

        }
        if(stringBuffer.length()>0&& stringBuffer.charAt(0) =='-'){
            stringBuffer.delete(0,1);
        }
        return  stringBuffer.toString().toUpperCase();


    }
}
