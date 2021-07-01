//给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。 
//
// 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。 
//
// 
//
// 
//
// 示例 1： 
//
// 
//输入：digits = "23"
//输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
// 
//
// 示例 2： 
//
// 
//输入：digits = ""
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：digits = "2"
//输出：["a","b","c"]
// 
//
// 
//
// 提示： 
//
// 
// 0 <= digits.length <= 4 
// digits[i] 是范围 ['2', '9'] 的一个数字。 
// 
// Related Topics 哈希表 字符串 回溯 
// 👍 1376 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber_17 {
    public static void main(String[] args) {
        Solution solution = new LetterCombinationsOfAPhoneNumber_17().new Solution();
        System.out.println(solution.letterCombinations("234"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> letterCombinations(String digits) {
            LinkedList<String> result = new LinkedList<>();
            if (digits == null || digits.length() == 0) {
                return result;
            }
            HashMap<Character, String> map = new HashMap<>();
            map.put('2', "abc");
            map.put('3', "def");
            map.put('4', "ghi");
            map.put('5', "jkl");
            map.put('6', "mno");
            map.put('7', "pqrs");
            map.put('8', "tuv");
            map.put('9', "wxyz");

            String temp = map.get(digits.charAt(0));
            for (int i = 0; i < temp.length(); i++) {
                result.offer(String.valueOf(temp.charAt(i)));
            }
            if (digits.length() == 1) {
                return result;
            }


            for (int i = 1; i < digits.length(); i++) {
                temp = map.get(digits.charAt(i));
                while (result.element().length() <= i) {
                    String perfix = result.poll();
                    for (int j = 0; j < temp.length(); j++) {
                        result.offer(perfix + temp.charAt(j));
                    }
                }
            }
            return result;
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

