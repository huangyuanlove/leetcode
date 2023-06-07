package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;

public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree_1379 {


    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {

        visit(cloned, target);
        return result;
    }
    TreeNode result = null;
    public void visit(TreeNode treeNode, TreeNode target) {
        if (treeNode != null) {
            if (treeNode.val == target.val) {
                result = treeNode;
            }
            visit(treeNode.left, target);
            visit(treeNode.right, target);
        }
    }

}
