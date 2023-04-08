package com.huangyuanlove.leetcode;

public class ImageSmoother_661 {
    public static void main(String[] args) {

    }

    public static int[][] imageSmoother(int[][] img) {
        int [][]result = new int[img.length][img[0].length];
        for (int r = 0; r < img.length; r++) {
            for (int c = 0; c < img[0].length; c++) {
                int sum = img[r][c];
                int count =1;
                if(c - 1 >=0){
                    sum +=img[r][c-1];
                    count+=1;
                }
                if(c + 1 < img[0].length){
                    sum+=img[r][c+1];
                    count +=1;
                }
                if(r-1>=0){
                    sum +=img[r-1][c];
                    count +=1;
                }
                if(c - 1 >=0 && r-1>=0){
                    sum +=img[r-1][c-1];
                    count +=1;
                }

                if(c-1>=0 && r+1 <img.length){
                    sum +=img[r+1][c-1];
                    count +=1;
                }

                if(r+1 <img.length){
                    sum += img[r+1][c];
                    count +=1;
                }

                if(r-1 >=0 && c + 1 < img[0].length){
                    sum += img[r-1][c+1];
                    count +=1;
                }

                if(r+1 <img.length &&  c + 1 < img[0].length){
                    sum += img[r+1][c+1];
                    count +=1;
                }
                result[r][c] = (int)Math.floor(sum *1.0 / count);

            }
        }
        return  result;

    }
}
