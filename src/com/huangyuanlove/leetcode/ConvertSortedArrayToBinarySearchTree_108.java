package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;

import javax.swing.event.TreeModelEvent;

public class ConvertSortedArrayToBinarySearchTree_108 {
    public static void main(String[] args) {

    }

    public static TreeNode sortedArrayToBST(int[] nums) {
      return  helper(nums,0,nums.length-1);
    }

    public static TreeNode helper(int[] nums,int start,int end){
        if(start > end){
            return null;
        }

        int mid = start +(end -start) /2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums,start,mid -1);
        root.right = helper(nums,mid +1,end);
        return root;
    }

}
