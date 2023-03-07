//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "()"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "()[]{}"
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：s = "(]"
//输出：false
// 
//
// 示例 4： 
//
// 
//输入：s = "([)]"
//输出：false
// 
//
// 示例 5： 
//
// 
//输入：s = "{[]}"
//输出：true 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 104 
// s 仅由括号 '()[]{}' 组成 
// 
// Related Topics 栈 字符串 
// 👍 2479 👎 0

  
  package com.huangyuanlove.leetcode;

import java.util.Stack;

public class ValidParentheses_20{
      public static void main(String[] args) {
           Solution solution = new ValidParentheses_20().new Solution();
          System.out.println(solution.isValid("([)]"));
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
        if(s == null || s.length() == 0){
            return true;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(isLeft(s.charAt(i))){
                stack.push(s.charAt(i));
            }else{
                if(stack.size() ==0){
                    return false;
                }
                char temp = stack.pop();
                if(isPair(temp,s.charAt(i))){

                }else{
                    return false;
                }
            }
        }
        return stack.size() ==0;
    }
    private boolean isLeft(char c){
        return  c =='(' || c =='[' || c == '{';
    }
    private boolean isPair(char left, char right){
        if(left =='('){
            return  right==')';
        }else if(left == '['){
            return  right ==']';
        }else {
            return right == '}';
        }

    }

}
//leetcode submit region end(Prohibit modification and deletion)

  }