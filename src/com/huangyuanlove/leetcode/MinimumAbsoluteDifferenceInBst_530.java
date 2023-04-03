package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;

public class MinimumAbsoluteDifferenceInBst_530 {
    public static void main(String[] args) {

    }
    int diff = Integer.MAX_VALUE;
    int pre = -1;
    public  int getMinimumDifference(TreeNode root) {
        if(root!=null){
            getMinimumDifference(root.left);
            if(pre ==-1){
                pre = root.val;
            }else{
                diff = Math.min(root.val-pre,diff);
            }
            getMinimumDifference(root.right);
        }



    }
}
