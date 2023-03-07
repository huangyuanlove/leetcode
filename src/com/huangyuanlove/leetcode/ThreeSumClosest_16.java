//给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和
//。假定每组输入只存在唯一答案。 
//
// 
//
// 示例： 
//
// 输入：nums = [-1,2,1,-4], target = 1
//输出：2
//解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
// 
//
// 
//
// 提示： 
//
// 
// 3 <= nums.length <= 10^3 
// -10^3 <= nums[i] <= 10^3 
// -10^4 <= target <= 10^4 
// 
// Related Topics 数组 双指针 排序 
// 👍 810 👎 0


package com.huangyuanlove.leetcode;

import java.util.Arrays;

public class ThreeSumClosest_16 {
    public static void main(String[] args) {
        Solution solution = new ThreeSumClosest_16().new Solution();
        System.out.println(solution.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            int result = nums[0] +nums[1] +nums[2];
            Arrays.sort(nums);

            for (int i = 0; i < nums.length-2; i++) {

                int start = i +1;
                int end = nums.length-1;

                while (start < end){
                    int sum = nums[i]+nums[start] + nums[end];
                    if(Math.abs(sum -target)  < Math.abs(result - target)){
                        result = sum;
                    }
                    if(sum == target){
                        return result;
                    }else if(sum > target){
                        end--;
                    }else{
                        start ++;
                    }
                }
            }


            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}