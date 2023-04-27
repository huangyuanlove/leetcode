package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;
import com.huangyuanlove.leetcode.helper.TreeNodeHelper;

import java.util.ArrayList;

public class IncreasingOrderSearchTree_897 {
    public static void main(String[] args) {
        TreeNode root = TreeNodeHelper.createBinaryTreeByLevel(new Integer[]{5,3,6,2,4,null,8,1,null,null,null,7,9});
        new IncreasingOrderSearchTree_897().increasingBST(root);
    }

    public TreeNode increasingBST(TreeNode root) {
        TreeNode newRoot = null;
        ArrayList<Integer> nodeArrayList = new ArrayList<>();
        visit(root,nodeArrayList);
        newRoot = new TreeNode(nodeArrayList.get(0));

        TreeNode tmp = newRoot;
        for (int i = 1; i < nodeArrayList.size(); i++) {
            TreeNode tmp1 = new TreeNode(nodeArrayList.get(i));
            tmp.right = tmp1;
            tmp = tmp1;

        }
        return  newRoot;
    }
    public void visit(TreeNode root, ArrayList<Integer> nodeArrayList){
        if(root!=null){

            visit(root.left,nodeArrayList);
            nodeArrayList.add(root.val);

            visit(root.right,nodeArrayList);

        }
    }
}
