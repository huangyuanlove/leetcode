//将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。 
//
// 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下： 
//
// 
//P   A   H   N
//A P L S I I G
//Y   I   R 
//
// 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。 
//
// 请你实现这个将字符串进行指定行数变换的函数： 
//
// 
//string convert(string s, int numRows); 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "PAYPALISHIRING", numRows = 3
//输出："PAHNAPLSIIGYIR"
// 
//示例 2：
//
// 
//输入：s = "PAYPALISHIRING", numRows = 4
//输出："PINALSIGYAHRPI"
//解释：
//P     I    N
//A   L S  I G
//Y A   H R
//P     I
// 
//
// 示例 3： 
//
// 
//输入：s = "A", numRows = 1
//输出："A"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 由英文字母（小写和大写）、',' 和 '.' 组成 
// 1 <= numRows <= 1000 
// 
// Related Topics 字符串 
// 👍 1182 👎 0


package com.huangyuanlove.leetcode;

public class ZigzagConversion_6 {
    public static void main(String[] args) {
        Solution solution = new ZigzagConversion_6().new Solution();

        String convertString = "PAYPALISHIRING";


        String result = solution.convert(convertString, 7);
        System.out.println(result);


    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String convert(String s, int numRows) {
            if (s == null || s.length() == 0) {
                return s;
            }
            if (numRows == 1 || s.length() == 1) {
                return s;
            }
            if (numRows == 2) {
                StringBuffer sb1 = new StringBuffer();
                StringBuffer sb2 = new StringBuffer();
                for (int i = 0; i < s.length(); i += 2) {
                    sb1.append(s.charAt(i));
                    if (i + 1 < s.length()) {
                        sb2.append(s.charAt(i + 1));
                    }
                }

                return sb1.append(sb2).toString();

            }


            double columnDouble = s.length() / (numRows + numRows - 2.0) * 2;
            int column = (int) Math.round(columnDouble+0.5);

            char[][] matrix = new char[numRows][column];
            //按列填充
            int count = 0;
            for (int j = 0; j < column; j++) {
                if(j%2 ==0){
                    for(int i = 0;i<numRows && count<s.length();i++){
                        matrix[i][j] = s.charAt(count);
                        count ++;
                    }
                }else{
                    for (int i = numRows-2; i >0 && count<s.length() ; i--) {
                        matrix[i][j] = s.charAt(count);
                        count ++;
                    }
                }
//                printMatrix(matrix);
            }



            //遍历
            StringBuffer result = new StringBuffer();
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < column; j++) {
                    if (matrix[i][j] != 0) {
                        result.append(matrix[i][j]);
                    }
                }
            }


            return result.toString();
        }
    }


    private void printMatrix(char[][] c){
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j] +"\t");
            }
            System.out.println();
        }
        System.out.println("------------");
    }
//leetcode submit region end(Prohibit modification and deletion)

}