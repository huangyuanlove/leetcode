package com.huangyuanlove.leetcode.editor.cn;//给你一个字符串 s，找到 s 中最长的回文子串。
//
// 
//
// 示例 1： 
//
// 
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。
// 
//
// 示例 2： 
//
// 
//输入：s = "cbbd"
//输出："bb"
// 
//
// 示例 3： 
//
// 
//输入：s = "a"
//输出："a"
// 
//
// 示例 4： 
//
// 
//输入：s = "ac"
//输出："a"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 仅由数字和英文字母（大写和/或小写）组成 
// 
// Related Topics 字符串 动态规划 
// 👍 3563 👎 0


import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        if(length < 2){
            return s;
        }

        int maxLen = 1;
        int begin = 0;
        char cs[] = s.toCharArray();
        for(int i =0;i<length;i++){
            for(int j = i+1; j < length;j++){
                if(j-i+1 > maxLen && check(cs,i,j)){
                    maxLen = j-i+1;
                    begin = i;
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }

    public boolean check(char[] c, int left,int right){
        while (left < right){
            if (c[left] != c[right]){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}

class SolutionTwo{
    public String longestPalindrome(String s) {
        if(s.length()<2){
            return  s;
        }
        char[] chars = s.toCharArray();
        int maxLen = 1;
        int begin = 0;
        for (int i = 0; i < s.length()-1; i++) {
           int oddLen = expandAroundCenter(chars,i,i);
           int evenLen = expandAroundCenter(chars,i,i+1);
           int currentLen = Math.max(oddLen,evenLen);
           if(currentLen>maxLen){
               maxLen = currentLen;
               begin = i - (maxLen-1)/2;
           }
        }
        return s.substring(begin,begin+maxLen);


        
    }
    public int expandAroundCenter(char[] s,int left, int right){
        int len = s.length;
        while (left>=0 && right<len){
            if(s[left] == s[right]){
                left --;
                right ++;
            }else{
                break;
            }
        }
        return right - left -1;
    }
}

//leetcode submit region end(Prohibit modification and deletion)

public class LongestPalindromicSubstring{
    
    public static void main(String ... args){

        System.out.println(new SolutionTwo().longestPalindrome("bb"));
    }

}
