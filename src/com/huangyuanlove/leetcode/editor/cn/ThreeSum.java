//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复
//的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 示例： 
//
// 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
// 
// Related Topics 数组 双指针 
// 👍 2752 👎 0


package com.huangyuanlove.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        Solution solution = new ThreeSum().new Solution();
        System.out.println(solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            ArrayList<Integer> integers;
            for (int i = 0; i < nums.length; i++) {
                int tempResult[] = twoSum(nums, -nums[i], i);
                if (tempResult != null) {
                    integers = new ArrayList<>(3);
                    integers.add(nums[i]);
                    integers.add(nums[tempResult[0]]);
                    integers.add(nums[tempResult[1]]);
                    result.add(integers);
                }

            }


            return result;
        }

        public int[] twoSum(int[] nums, int target, int skipIndex) {

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (i == skipIndex) {
                    continue;
                }
                if (map.containsKey(nums[i])) {
                    return new int[]{map.get(nums[i]), i};
                }
                map.put(target - nums[i], i);
            }
            return null;

        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}