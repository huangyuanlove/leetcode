package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;
import com.huangyuanlove.leetcode.helper.TreeNodeHelper;

public class SumOfLeftLeaves_404 {

    public static void main(String[] args) {

        TreeNode node = TreeNodeHelper.createBinaryTreeByLevel(new Integer[]{3, 4, 5, -7, -6, null, null, -7, null, -5, null, null, null, -4});
//        TreeNode node = TreeNodeHelper.createBinaryTreeByLevel(new Integer[]{1,null,2});
//        TreeNode node = TreeNodeHelper.createBinaryTreeByLevel(new Integer[]{3, 9, 20, null, null, 15, 7});
        int result = sumOfLeftLeaves(node);
        System.out.println(result);


    }

    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return root.val;
        }

        return visit(root.left, true) + visit(root.right, false);

    }

    public static int visit(TreeNode node, boolean isLeft) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            if (isLeft) {
                return node.val;
            }
            return 0;
        }

        int left = visit(node.left, true);
        int right = visit(node.right, false);
        return left + right;
    }

}
