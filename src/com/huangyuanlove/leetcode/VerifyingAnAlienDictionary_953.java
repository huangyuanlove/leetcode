package com.huangyuanlove.leetcode;

public class VerifyingAnAlienDictionary_953 {
    public static void main(String[] args) {

        boolean result = new VerifyingAnAlienDictionary_953().isAlienSorted(new String[]{"apple","app"}, "abcdefghijklmnopqrstuvwxyz");
        System.out.println(result);
    }

    public boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < words.length - 1; i++) {
            int result = compare(words[i], words[i + 1], order);
            System.out.println("isAlienSorted-> " + result);
            if (result > 0) {
                return false;
            }
        }
        System.out.println("isAlienSorted-> true" );
        return true;

    }

    //前面的大于后面的 返回正数
    //相等返回0
    //后面的大于前面的，返回负数
    public int compare(String o1, String o2, String order) {
        char[] o1Chars = o1.toCharArray();
        char[] o2Chars = o2.toCharArray();
        for (int i = 0; i < o1Chars.length && i < o2Chars.length; i++) {
            int result = compare(o1Chars[i], o2Chars[i], order);
            System.out.println("compare str-> " + result);
            if (result != 0) {
                return result;
            }
        }
        if(o2Chars.length < o1Chars.length){
            return 1;
        }else if(o2Chars.length == o1Chars.length){
            return 0;
        }else{
            return  -1;
        }
    }

    //前面的大于后面的 返回正数
    //相等返回0
    //后面的大于前面的，返回负数
    public int compare(char source, char other, String order) {
        if (source == other) {
            System.out.println("compare char -> 0" );
            return 0;
        }
        int result = order.indexOf(source) - order.indexOf(other);
        System.out.println("compare char -> " + result);
        return result;
    }
}
