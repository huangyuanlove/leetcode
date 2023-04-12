package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;
import com.huangyuanlove.leetcode.helper.TreeNodeHelper;

public class MergeTwoBinaryTrees_617 {
    public static void main(String[] args) {
        TreeNode root1 = TreeNodeHelper.createBinaryTreeByLevel(new Integer[]{1,3,2,5});
        TreeNode root2 = TreeNodeHelper.createBinaryTreeByLevel(new Integer[]{2,1,3,null,4,null,7});
        TreeNode result = mergeTrees(root1,root2);
        TreeNodeHelper.levelVisit(result);
    }
    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null){
            return root2;
        }
        if(root2 ==null){
            return root1;
        }
        merge(root1,root2);
        //当前节点需要处理的事情
       return root1;


    }

    public static void merge(TreeNode root1, TreeNode root2){
        if(root1!=null || root2!=null){

            if(root1!=null && root2!=null){
                root1.val += root2.val;
                if(root1.left !=null && root2.left!=null){
                    merge(root1.left,root2.left);
                }else if(root1.left==null && root2.left!=null){
                    root1.left = root2.left;
                }

                if(root1.right !=null && root2.right!=null){
                    merge(root1.right,root2.right);
                }else if(root1.right==null && root2.right!=null){
                    root1.right = root2.right;
                }

            }

        }
    }
}
