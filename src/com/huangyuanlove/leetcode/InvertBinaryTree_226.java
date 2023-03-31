package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;
import com.huangyuanlove.leetcode.helper.TreeNodeHelper;

public class InvertBinaryTree_226 {
    public static void main(String[] args) {
        TreeNode root = TreeNodeHelper.createBinaryTreeByLevel(new Integer[]{4, 2, 7, 1, 3, 6, 9});
        TreeNodeHelper.inorder(root);
        System.out.println();
        TreeNode result = invertTree(root);
        TreeNodeHelper.inorder(result);

    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        } else {
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }
}
