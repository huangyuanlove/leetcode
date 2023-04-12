package com.huangyuanlove.leetcode;

public class LongestChunkedPalindromeDecomposition_1147 {

    public static void main(String[] args) {
        System.out.println(longestDecomposition("ghiabcdefhelloadamhelloabcdefghi"));
        System.out.println(longestDecomposition("merchant"));
        System.out.println(longestDecomposition("antaprezatepzapreanta"));
        System.out.println(longestDecomposition("vwsuvmbwknmnvwsuvmbwk"));

    }

    //ghiabcdefhelloadamhelloabcdefghi
    //(ghi)(abcdef)(hello)(adam)(hello)(abcdef)(ghi)

    /**
     * 一个end指针从后向前遍历，找到和start指向相同的字符；
     * 记录当前end的位置，然后逐个对比
     * 相同则start+相同的长度
     * 不同则break，继续寻找
     */

    public static int longestDecomposition(String text) {
        int count = 0;
        int start = 0;
        int end = text.length() - 1;
        int preEnd = end;
        int tmpStrLength = 0;
        while (start < end) {
            System.out.println("正在对比的字符：" + text.charAt(start) + "，" + text.charAt(end));
            if (text.charAt(start) == text.charAt(end)) {

                System.out.println("找到相同的字符：" + text.charAt(start) + ",start:" + start + ",end:" + end);
                String startStr = text.substring(start, start + tmpStrLength+1);
                String endStr = text.substring(end, end + tmpStrLength+1);
                System.out.println("需要对比字符数：" + (tmpStrLength+1) + ",startStr:" + startStr + ",endStr:" + endStr);

                if (startStr.equals(endStr)) {
                    start += tmpStrLength+1;
                    preEnd = end;
                    count += 2;
                    tmpStrLength = 0;
                }else{
                    tmpStrLength++;
                }

            }else{
                tmpStrLength++;
            }
            end--;



        }
        if (preEnd - start >= 1) {
            count += 1;
        }
        return count;


    }
}
