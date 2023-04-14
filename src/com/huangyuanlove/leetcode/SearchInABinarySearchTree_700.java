package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;

public class SearchInABinarySearchTree_700 {
    public static void main(String[] args) {

    }
    public static TreeNode result;
    public static TreeNode searchBST(TreeNode root, int val) {
        visit(root, val);
        return result;
    }
    public static void visit(TreeNode root,int val){
        if(root!=null){
            if(root.val == val){
                result = root;
                return;
            }
            visit(root.left,val);
            visit(root.right,val);
        }
    }
}
