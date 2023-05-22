package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;

import java.util.ArrayList;

public class MinimumDistanceBetweenBstNodes_783 {

    public int minDiffInBST(TreeNode root) {

        ArrayList<Integer> nodeValue = new ArrayList<>();
        visit(root,nodeValue);
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<nodeValue.size()-1;i++){
            min = Math.min(min,nodeValue.get(i+1)-nodeValue.get(i));
        }
        return min;

    }

    public void visit(TreeNode node, ArrayList<Integer> list){
        if(node!=null){
            visit(node.left,list);
            list.add(node.val);
            visit(node.right,list);
        }
    }

}
