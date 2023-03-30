package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;
import com.huangyuanlove.leetcode.helper.TreeNodeHelper;

public class MinimumDepthOfBinaryTree_111 {
    public static void main(String[] args) {
        TreeNode root = TreeNodeHelper.createBinaryTreeByLevel(new Integer[]{3,9,20,null,null,15,7});
        System.out.println(minDepth(root));
        root = TreeNodeHelper.createBinaryTreeByLevel(new Integer[]{2,null,3,null,4,null,5,null,6});
        System.out.println(minDepth(root));
    }


    public static int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        if(root.left!=null && root.right==null){
            return 1+minDepth(root.left);
        }
        if(root.left ==null && root.right!=null){
            return 1 + minDepth(root.right);
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(left < right){
            return left +1;
        }
        return right +1;

    }
}
