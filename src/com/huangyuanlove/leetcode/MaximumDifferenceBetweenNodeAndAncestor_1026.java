package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;

public class MaximumDifferenceBetweenNodeAndAncestor_1026 {

    public static void main(String[] args) {

    }

    public int maxAncestorDiff(TreeNode root) {
        return visit(root,root.val,root.val);

    }
    public int visit(TreeNode root,int max,int min){
        if(root == null){
            return 0;
        }
        int diff =Math.max(Math.abs(max-root.val),  Math.abs(min- root.val) );

        max = Math.max(max,root.val);
        min  = Math.min(min, root.val);
        int left = visit(root.left,max,min);
        int right = visit(root.right,max,min);
        return Math.max(Math.max(left,right),diff);
    }
}
