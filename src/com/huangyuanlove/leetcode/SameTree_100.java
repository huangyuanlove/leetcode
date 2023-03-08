package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;

public class SameTree_100 {
    public static void main(String[] args) {

    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q ==null){
            return true;
        }else if(p!=null && q!=null && p.val == q.val){
            return isSameTree(p.left ,q.left) && isSameTree(p.right,q.right);
        }else{
            return false;
        }
    }

}
