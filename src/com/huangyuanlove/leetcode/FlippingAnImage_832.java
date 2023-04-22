package com.huangyuanlove.leetcode;

public class FlippingAnImage_832 {
    public static void main(String[] args) {

    }
    /**
     * 对于前后需要交换的两位，
     * 若相等，则最后结果为反转后结果，如 1,1 交换-> 1,1 反转-> 0,0
     * 若不等，则最后结果为自己本身，如 1,0 交换-> 0,1 反转-> 1,0
     *
     * 另外，我们可通过与 1进行异或运算，将数进行反转，即 x = x^1
     * 如: x=1时，1^1 = 0， x=0，0^1 = 1。
     */
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int l = 0, r = image[i].length-1; l <= r; l++, r--) {
                if (image[i][l] == image[i][r]) {
                    image[i][l] ^= 1;
                    image[i][r] = image[i][l];
                }
            }
        }
        return image;
    }
}
