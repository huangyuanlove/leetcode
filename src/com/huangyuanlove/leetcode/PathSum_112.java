package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;
import com.huangyuanlove.leetcode.helper.TreeNodeHelper;

import javax.lang.model.type.UnionType;

public class PathSum_112 {
    public static void main(String[] args) {


        TreeNode root = TreeNodeHelper.createBinaryTreeByLevel(new Integer[]{1,2,3});
//        TreeNode root = TreeNodeHelper.createBinaryTreeByLevel(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1});
        System.out.println(hasPathSum(root, 5));


    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null && targetSum == 0) {

            return true;
        }
        if (root == null && targetSum != 0) {

            return false;
        }
        System.out.println("root.val->" + root.val + "  targetSum->" + targetSum);

        if (root.left == null && root.right == null && targetSum == root.val) {

            return true;
        }
        if (root.left == null && root.right == null) {

            return false;
        }

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);

    }


}
