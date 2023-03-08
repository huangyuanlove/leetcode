package com.huangyuanlove.leetcode.helper;

public class TreeNodeHelper {

    public static TreeNode createBTree(){
        TreeNode root = new TreeNode(1);

        TreeNode two = new TreeNode(2);

        TreeNode three = new TreeNode(3);

        root.right = two;
        two.left = three;


        return root;
    }
}
