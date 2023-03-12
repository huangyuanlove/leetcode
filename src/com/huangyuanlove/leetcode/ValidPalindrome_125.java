package com.huangyuanlove.leetcode;

public class ValidPalindrome_125 {
    public static void main(String[] args) {
        int a = 'a' - 0;
        int A = 'A' - 0;
        int z = 'z' - 0;
        int Z = 'Z' - 0;

        int a0  = '0' -0;
        int a9 = '9'-0;

        System.out.println(a + "  " + z + " " + A + "  " + Z);
        System.out.println(a0 +" " + a9);
    }

    public static boolean isPalindrome(String s) {
        if (s.trim().length() == 0) {
            return true;
        }

        boolean result = true;
        int preIndex = 0;
        int lastIndex = s.length() - 1;
        while (lastIndex - preIndex >= 1) {
            char preChar = s.charAt(preIndex);
            char lastChar = s.charAt(lastIndex);
            if (preChar >= 97 && preChar <= 122) {

            } else if (preChar >= 65 && preChar <= 90) {
                preChar += 32;
            } else if (preChar >=48 && preChar <= 57) {

            } else {
                preIndex++;
                continue;
            }
            if (lastChar >= 97 && lastChar <= 122) {

            } else if (lastChar >= 65 && lastChar <= 90) {
                lastChar += 32;
            }else if (lastChar >=48 && lastChar <= 57) {

            } else {
                lastIndex--;
                continue;
            }
            if (preChar == lastChar) {
                lastIndex--;
                preIndex++;
            } else {
                result = false;
                break;
            }

        }
        return result;

    }
}
