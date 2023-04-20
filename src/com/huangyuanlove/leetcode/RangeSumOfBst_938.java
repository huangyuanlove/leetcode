package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;

public class RangeSumOfBst_938 {
    public static void main(String[] args) {

    }
    static int sum = 0;
    public static int rangeSumBST(TreeNode root, int low, int high) {
        visit(root,low,high);
        return  sum;
    }
    static void visit(TreeNode root, int low, int high){
        if(root!=null){
            if(root.val >= low && root.val<=high){
                sum+=root.val;
            }

            visit(root.left,low,high);
            visit(root.right,low,high);
        }
    }
}
