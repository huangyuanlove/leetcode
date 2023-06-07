package com.huangyuanlove.leetcode;

import java.util.HashSet;

public class PathCrossing_1496 {
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        char[] chars = path.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x+=20001;
                    break;
                case 'W':
                    x-=20001;
                    break;
            }
            if(!set.add(x+y)){
                return  true;
            }
        }
        return false;

    }
}
