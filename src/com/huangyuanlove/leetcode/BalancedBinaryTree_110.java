package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;
import com.huangyuanlove.leetcode.helper.TreeNodeHelper;

public class BalancedBinaryTree_110 {

    public static void main(String[] args) {
        TreeNode root = TreeNodeHelper.createBinaryTreeByLevel(new Integer[]{3,9,20,null,null,15,7});
        System.out.println(isBalanced(root));

    }

    public static boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        if(Math.abs(deep(root.left) - deep(root.right)) > 1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);


    }
    public static int deep(TreeNode treeNode){
        if(treeNode == null){
            return 0;
        }
        int left = deep(treeNode.left);
        int right = deep(treeNode.right);

        if(left > right){
            return left +1;
        }
        return right +1;

    }
}
