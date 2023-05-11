package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;
import com.huangyuanlove.leetcode.helper.TreeNodeHelper;

public class SumOfTootToLeafBinaryNumbers_1022 {
    public static void main(String[] args) {
        TreeNode root = TreeNodeHelper.createBinaryTreeByLevel(new Integer[]{1,0,1,0,1,0,1});
      int result =  new SumOfTootToLeafBinaryNumbers_1022().sumRootToLeaf(root);
        System.out.println(result);

    }
    public int sumRootToLeaf(TreeNode root) {
        return helper(root, 0);
    }

    private int helper(TreeNode root, int sum){
        if(root == null) return 0;
        sum = 2 *sum + root.val;
        if(root.left == null && root.right == null){
            return sum;
        }
        return helper(root.left, sum) + helper(root.right, sum);
    }
}
