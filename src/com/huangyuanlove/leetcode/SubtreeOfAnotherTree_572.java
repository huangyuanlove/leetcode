package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;
import com.huangyuanlove.leetcode.helper.TreeNodeHelper;

public class SubtreeOfAnotherTree_572 {
    public static void main(String[] args) {
        TreeNode node = TreeNodeHelper.createBinaryTreeByLevel(new Integer[]{1,2,3});
        TreeNode subNode = TreeNodeHelper.createBinaryTreeByLevel(new Integer[]{1,2});
        System.out.println(isSubtree(node,subNode));
    }
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if(root==null && subRoot==null){
            return true;
        }
        if(root !=null && subRoot == null){
            return false;
        }
        if(root == null && subRoot !=null){
            return false;
        }


        return isSameTree(root,subRoot) || isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);

    }
    public static  boolean isSameTree(TreeNode root,TreeNode subRoot){
       if(root == null && subRoot ==null){
           return true;
       }
       return root!=null && subRoot!=null && root.val == subRoot.val && isSameTree(root.left,subRoot.left) && isSameTree(root.right,subRoot.right);
    }



}
