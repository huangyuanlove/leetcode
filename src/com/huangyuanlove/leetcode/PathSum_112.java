package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;
import com.huangyuanlove.leetcode.helper.TreeNodeHelper;

import javax.lang.model.type.UnionType;

public class PathSum_112 {
    public static void main(String[] args) {


        TreeNode root = TreeNodeHelper.createBinaryTreeByLevel(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1});
        visit(root);

    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        return false;
    }

    public static void visit(TreeNode node) {
        if (node != null) {
            System.out.println(node.val);
            visit(node.left);
            visit(node.right);
        }
    }
}
