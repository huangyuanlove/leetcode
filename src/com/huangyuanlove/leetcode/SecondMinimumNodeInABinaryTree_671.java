package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;

public class SecondMinimumNodeInABinaryTree_671 {

    public static void main(String[] args) {

    }
    private int secondMin = 0;
    private int firstMin = 0;
    public static int findSecondMinimumValue(TreeNode root) {

return find(root, root.val);


    }
    public static int find(TreeNode node,int val){
        if(node == null){
            return -1;
        }
        if(node.val > val){
            return node.val;
        }
        int left = find(node.left,val);
        int right = find(node.right,val);
        if(left > val && right > val){
            return Math.min(left,right);
        }
        return Math.max(left,right);




    }

}
