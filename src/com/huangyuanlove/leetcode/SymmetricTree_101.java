package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;

public class SymmetricTree_101 {
    public static void main(String[] args) {

    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return same(root.left, root.right);
    }

    public static boolean same(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left != null && right != null && left.val == right.val) {
            return same(left.left, right.right) && same(left.right, right.left);
        } else {
            return false;
        }
    }
}
