package com.huangyuanlove.leetcode;

public class ShuffleString_1528 {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        char[] chars = s.toCharArray();
        for (int i = 0; i <indices.length; i++) {

          result[indices[i]]=  chars[i];
        }

        return new String(result);
    }
}
