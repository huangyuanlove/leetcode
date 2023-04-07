package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;
import com.huangyuanlove.leetcode.helper.TreeNodeHelper;

public class ConstructStringFromBinaryTree_606 {
    public static void main(String[] args) {
        TreeNode treeNode = TreeNodeHelper.createBinaryTreeByLevel(new Integer[]{1, 2, 3,null, 4});
        String result = tree2str(treeNode);
        System.out.println(result);
    }

    static StringBuffer sb = new StringBuffer();

    // 1 (2 (4) () )       (3()())
// 1 (2 (4)    )       (3    )
// 1 (2 ()  (4))       (3    )
    public static String tree2str(TreeNode root) {
        if(root == null){
            return "";
        }
        if(root.left!=null && root.right !=null){
            return root.val +"(" + tree2str(root.left) +")(" + tree2str(root.right) +")";
        }else if(root.left!=null && root.right == null){
            return root.val +"(" + tree2str(root.left) +")";
        }else if(root.left==null && root.right!=null){
           return root.val +"()(" + tree2str(root.right) +")";
        }else {
            return root.val+"";
        }
    }

}
