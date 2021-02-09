//给你一个二进制字符串 s（仅由 '0' 和 '1' 组成的字符串）。 
//
// 返回所有字符都为 1 的子字符串的数目。 
//
// 由于答案可能很大，请你将它对 10^9 + 7 取模后返回。 
//
// 
//
// 示例 1： 
//
// 输入：s = "0110111"
//输出：9
//解释：共有 9 个子字符串仅由 '1' 组成
//"1" -> 5 次
//"11" -> 3 次
//"111" -> 1 次 
//
// 示例 2： 
//
// 输入：s = "101"
//输出：2
//解释：子字符串 "1" 在 s 中共出现 2 次
// 
//
// 示例 3： 
//
// 输入：s = "111111"
//输出：21
//解释：每个子字符串都仅由 '1' 组成
// 
//
// 示例 4： 
//
// 输入：s = "000"
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// s[i] == '0' 或 s[i] == '1' 
// 1 <= s.length <= 10^5 
// 
// Related Topics 数学 字符串 
// 👍 11 👎 0


package com.huangyuanlove.leetcode;

import java.util.HashMap;

public class NumberOfSubstringsWithOnly1s_1513 {
    public static void main(String[] args) {
        Solution solution = new NumberOfSubstringsWithOnly1s_1513().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numSub(String s) {
            double count = 0;
            HashMap<Integer, Double> tempResult = new HashMap<>();
            String[] result = s.split("0");
            for (String sub : result) {
                if (sub.length() <= 0) {
                    continue;
                }

                Double temp = tempResult.get(sub.length());

                if (temp != null && temp != 0) {
                    count += temp;
                } else {
                    double tempCount = countNumber(sub.length());
                    tempResult.put(sub.length(), tempCount);
                    count += tempCount;
                }

            }
            return Double.valueOf(count % (Math.pow(10, 9) + 7)).intValue();
        }

        public double countNumber(int number) {
            double sum = 0;
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            return sum;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}