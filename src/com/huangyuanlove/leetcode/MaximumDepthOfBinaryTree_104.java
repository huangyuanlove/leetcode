package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;
import com.huangyuanlove.leetcode.helper.TreeNodeHelper;

public class MaximumDepthOfBinaryTree_104 {
    public static void main(String[] args) {
        TreeNode root = TreeNodeHelper.createBTree();
        System.out.println(maxDepth(root));

    }
    public static int maxDepth(TreeNode root) {
       if(root == null){
           return 0;
       }
       int left = maxDepth(root.left);
       int right = maxDepth(root.right);
       if(left > right){
           return left+1;
       }
       return  right+1;

    }
}


