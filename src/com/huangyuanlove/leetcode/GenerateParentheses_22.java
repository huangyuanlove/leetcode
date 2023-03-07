//数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 3
//输出：["((()))","(()())","(())()","()(())","()()()"]
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：["()"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 8 
// 
// Related Topics 字符串 动态规划 回溯 
// 👍 1856 👎 0


package com.huangyuanlove.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses_22 {
    public static void main(String[] args) {
        Solution solution = new GenerateParentheses_22().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private  ArrayList<String> result = new ArrayList<>();
        public List<String> generateParenthesis(int n) {
            if (n == 0) {
                return result;
            }
            generate(n,n,n*2,"");

            return result;

        }

        public  void generate(int left ,int right,int level,String str){
            if(level==0){
                result.add(str);
                System.out.println(str);
                return;
            }

            if(left>0){
                generate(left-1,right,level -1,str+"(");

            }
            if(right>left){
                generate(left,right-1,level -1,str+")");

            }

        }
    }
//leetcode submit region end(Prohibit modification and deletion)



}