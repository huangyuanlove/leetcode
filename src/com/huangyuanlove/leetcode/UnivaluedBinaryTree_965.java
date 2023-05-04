package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;

public class UnivaluedBinaryTree_965 {

    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        return visit(root.left, root.val) && visit(root.right, root.val);

    }

    public boolean visit(TreeNode root, int val) {
        if (root == null) {
            return true;
        }
        return root.val == val && visit(root.left, val) && visit(root.right, val);
    }

}
