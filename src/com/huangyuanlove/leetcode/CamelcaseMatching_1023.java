package com.huangyuanlove.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CamelcaseMatching_1023 {
    public static void main(String[] args) {

    }

    /**
     * ：queries = ["aafFaoo","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"], pattern = "Fo"
     *             [true,false,false,false,false]
     */
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        int n = queries.length;
        List<Boolean> res = new ArrayList<Boolean>();
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            int p = 0;
            for (int j = 0; j < queries[i].length(); j++) {
                char c = queries[i].charAt(j);
                if (p < pattern.length() && pattern.charAt(p) == c) {
                    p++;
                } else if (Character.isUpperCase(c)) {
                    flag = false;
                    break;
                }
            }
            if (p < pattern.length()) {
                flag = false;
            }
            res.add(flag);
        }
        return res;

    }

}
