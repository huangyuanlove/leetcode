package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;
import com.huangyuanlove.leetcode.helper.TreeNodeHelper;

import javax.swing.plaf.ProgressBarUI;

public class BinaryTreeTilt_563 {
    public static void main(String[] args) {
        TreeNode root = TreeNodeHelper.createBinaryTreeByLevel(new Integer[]{4,2,9,3,5,null,7});
        System.out.println(findTilt(root));
        sum =0;
        System.out.println("------------");
         root = TreeNodeHelper.createBinaryTreeByLevel(new Integer[]{-8,3,0,-8,null,null,null,null,-1,null,8});
        System.out.println(findTilt(root));
    }

    static int sum = 0;

    public static int findTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }
        visit(root);
        return sum;
    }

    public static int visit(TreeNode root) {
        if(root.left==null && root.right ==null ){
            System.out.println(root.val +"--> 0");
            return root.val;
        }else if(root.left !=null && root.right!=null){
            int left = visit(root.left);
            int right = visit(root.right);
            sum += Math.abs(left-right);
            System.out.println(root.val +"--> " + Math.abs(left-right));
            return left + right + root.val;
        }else if(root.left!=null && root.right == null){
            int left = visit(root.left);
            sum += Math.abs(left);
            System.out.println(root.val +"--> " + Math.abs(left));
            return left + root.val;
        }else{

            int right = visit(root.right);

            sum  +=Math.abs(right);
            System.out.println(root.val +"--> " + Math.abs(right));
            return right + root.val;
        }



    }
}
