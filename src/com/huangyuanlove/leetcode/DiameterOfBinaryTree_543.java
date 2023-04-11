package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;
import com.huangyuanlove.leetcode.helper.TreeNodeHelper;

public class DiameterOfBinaryTree_543 {
    public static void main(String[] args) {
        TreeNode root = TreeNodeHelper.createBinaryTreeByLevel(new Integer[]{1,2,3,4,5});
        System.out.println(diameterOfBinaryTree(root));
    }
    static int  max = 0;
    public static int diameterOfBinaryTree(TreeNode root) {

        visit(root);


        return max;
    }
  static  int visit(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right ==null){
            return 0;
        }
        int left = root.left ==null?0:  visit(root.left)+1;
        int right =root.right == null?0: visit(root.right) + 1;
        max = Math.max(max,left + right);
        return Math.max(left,right);
    }
}
