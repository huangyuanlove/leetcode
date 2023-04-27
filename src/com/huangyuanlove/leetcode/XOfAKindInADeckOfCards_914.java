package com.huangyuanlove.leetcode;

import java.util.HashMap;
import java.util.Map;

public class XOfAKindInADeckOfCards_914 {
    public boolean hasGroupsSizeX(int[] deck) {



        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < deck.length; i++) {
            map.put(deck[i],map.getOrDefault(deck[i],0)+1);
        }
        int gcd = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            gcd = gcd(gcd,entry.getValue());
            if(gcd == 1){
                return false;
            }
        }
        return gcd>=2;
    }
    private int gcd (int a, int b) {
        return b == 0? a: gcd(b, a % b);
    }
}
