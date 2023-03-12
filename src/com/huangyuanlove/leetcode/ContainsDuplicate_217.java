package com.huangyuanlove.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate_217 {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num :nums) {
            if(!hashSet.add(num)){
                return true;
            }
        }
        return false;


    }


}
