//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 
//
// 示例 1： 
//
// 
//输入：strs = ["flower","flow","flight"]
//输出："fl"
// 
//
// 示例 2： 
//
// 
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。 
//
// 
//
// 提示： 
//
// 
// 0 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] 仅由小写英文字母组成 
// 
// Related Topics 字符串 
// 👍 1658 👎 0


package leetcode.editor.cn;


public class LongestCommonPrefix_14 {
    public static void main(String[] args) {
        Solution solution = new LongestCommonPrefix_14().new Solution();
        System.out.println(solution.longestCommonPrefix(new String[]{"ab","a"}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {

            if (strs == null || strs.length == 0) {
                return "";
            }
            if (strs.length == 1) {
                return strs[0];
            }
            //取第一个字符串为最长公共前缀，然后每次拿公共前缀和下一个字符串比较
            int i = 1;
            StringBuilder commonPrefix = new StringBuilder(strs[0]);

            while (i<strs.length){
                String temp = strs[i];
                if(commonPrefix.length() > temp.length()){
                    commonPrefix.delete(temp.length(),commonPrefix.length());
                }

                for (int j = 0; j < temp.length() && j < commonPrefix.length(); j++) {
                    if(temp.charAt(j) != commonPrefix.charAt(j)){
                        commonPrefix.delete(j,commonPrefix.length());
                        break;
                    }
                }
                i++;
            }
            return commonPrefix.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}