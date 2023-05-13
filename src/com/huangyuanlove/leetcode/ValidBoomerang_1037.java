package com.huangyuanlove.leetcode;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.Objects;

public class ValidBoomerang_1037 {
    public static void main(String[] args) {
        boolean result = new ValidBoomerang_1037().isBoomerang(new int[][]{{73,31},{73,19},{73,45}});
        System.out.println(result);
    }
    public boolean isBoomerang(int[][] points) {


        int x1 = points[0][0] - points[1][0];
        int y1 = points[0][1] - points[1][1];

        int x2 = points[0][0] - points[2][0];
        int y2 = points[0][1] - points[2][1];

        return x1 * y2 != x2 * y1;
    }


}
