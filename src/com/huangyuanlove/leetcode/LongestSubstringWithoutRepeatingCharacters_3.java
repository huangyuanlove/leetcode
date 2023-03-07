//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
//
// 示例 4: 
//
// 
//输入: s = ""
//输出: 0
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 5 * 104 
// s 由英文字母、数字、符号和空格组成 
// 
// Related Topics 哈希表 双指针 字符串 Sliding Window 
// 👍 5341 👎 0


package com.huangyuanlove.leetcode;

public class LongestSubstringWithoutRepeatingCharacters_3 {
    public static void main(String[] args) {
        Solution solution = new LongestSubstringWithoutRepeatingCharacters_3().new Solution();
        System.out.println(solution.lengthOfLongestSubstring("bbtablud"));
        System.out.println("-----------");
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
        System.out.println("-----------");
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println("-----------");
        System.out.println(solution.lengthOfLongestSubstring(""));
        System.out.println("-----------");
        System.out.println(solution.lengthOfLongestSubstring("aaaa"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }
            if (s.length() == 1) {
                return 1;
            }

            int start = 0;
            int end = 0;
            int maxCount = 0;
            while (end < s.length()){
                int st = start;
                for (int i = st; i < end; i++) {

                    if(s.charAt(i) == s.charAt(end)){
                        start=i+1;
                        break;
                    }
                }

                
                end ++;
                if(end -start > maxCount){
                    maxCount = end -start;
                }

            }

            return maxCount;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}