//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重
//复的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-1,0,1,2,-1,-4]
//输出：[[-1,-1,2],[-1,0,1]]
// 
//
// 示例 2： 
//
// 
//输入：nums = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：nums = [0]
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 3000 
// -105 <= nums[i] <= 105 
// 
// Related Topics 数组 双指针 Sorting 
// 👍 3443 👎 0


package com.huangyuanlove.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_15 {
    public static void main(String[] args) {
        Solution solution = new ThreeSum_15().new Solution();
        List<List<Integer>> result = solution.threeSum(new int[]{-1,0,1,2,-1,-4});
        System.out.println(result);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            if(nums==null || nums.length<3){
                return result;
            }
            Arrays.sort(nums);
            for (int k = 0; k < nums.length - 2; k++) {
                //排序数组，最小的大于0则三数之和不可能等于0
                if(nums[k] >0){
                    break;
                }
                //去除重复结果
                if(k>0 && nums[k]==nums[k-1]){
                    continue;
                }
                int i=k+1;
                int j = nums.length-1;
                while (i<j){
                    int sum = nums[k]+nums[i]+nums[j];
                    if(sum<0){
                        while (i<j && nums[i] == nums[++i]);
                    }else if(sum>0){
                        while (i<j && nums[j] == nums[--j]);
                    }else{
                        result.add(Arrays.asList(nums[k],nums[i],nums[j]));
                        while (i<j && nums[i] == nums[++i]);
                        while (i<j && nums[j] == nums[--j]);
                    }
                }
            }
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}