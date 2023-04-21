package com.huangyuanlove.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class JewelsAndStones_771 {
    public static void main(String[] args) {

    }
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        HashSet<Character> jewelsSet = new HashSet<>(jewels.length());
        for (int i = 0; i < jewels.length(); i++) {
            jewelsSet.add(jewels.charAt(i));
        }

        for (int i = 0; i < stones.length(); i++) {
            if(jewelsSet.contains(stones.charAt(i))){
                result ++;
            }
        }
        return result;
    }
}
