package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class binaryTreeInorderTraversal_94 {
    public static void main(String[] args) {

    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    public static void inorder(TreeNode node, ArrayList<Integer> result) {
        if (node != null) {
            inorder(node.left, result);
            result.add(node.val);
            inorder(node.right, result);
        }

    }
}
