package com.huangyuanlove.leetcode;

public class _1BitAnd2BitCharacters_717 {

    public static void main(String[] args) {

    }

    public boolean isOneBitCharacter(int[] bits) {
        if (bits.length == 1) {
            return true;
        }
        if (bits[bits.length - 2] == 0) {
            return true;
        }

        int count = 0;
        for (int i = bits.length - 2; i >= 0; i--) {
            if (bits[i] == 1) {
                count++;
            } else {
                break;
            }
        }
        return count % 2 == 0;
    }
}
