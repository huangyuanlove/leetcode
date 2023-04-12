package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;
import com.huangyuanlove.leetcode.helper.TreeNodeHelper;

public class SubtreeOfAnotherTree_572 {
    public static void main(String[] args) {
        TreeNode node = TreeNodeHelper.createBinaryTreeByLevel(new Integer[]{1,2,3});
        TreeNode subNode = TreeNodeHelper.createBinaryTreeByLevel(new Integer[]{1,2});
        System.out.println(isSubtree(node,subNode));
    }
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return false;

    }


}
