package com.huangyuanlove.leetcode.helper;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class TreeNodeHelper {

    public static void main(String[] args) {
        TreeNode result = createBinaryTreeByLevel(new Integer[]{1,2,2,null,3,null,3});
        TreeNode root = createBinaryTreeByLevel(new Integer[]{3,9,20,null,null,15,7});
    }

    public static TreeNode createBTree(){
        TreeNode root = new TreeNode(1);

        TreeNode two = new TreeNode(2);

        TreeNode three = new TreeNode(3);

        root.right = two;
        two.left = three;


        return root;
    }

    public static TreeNode createBinaryTreeByLevel(Integer[] nodes){
        LinkedBlockingQueue<TreeNode> queue = new LinkedBlockingQueue<>();

        TreeNode head = new TreeNode(nodes[0]);
        TreeNode currentNode = head;
        queue.add(head);
        Integer currentValue;

        for (int i = 1; i < nodes.length; i++) {
            currentValue = nodes[i];
            TreeNode tmp = null;
            if(currentValue!=null){
                tmp = new TreeNode(currentValue);
            }

            while (currentNode.hasPrecessRight){
                currentNode = queue.poll();
            }
            if(currentNode.hasProcessLeft){
                currentNode.right = tmp;
                currentNode.hasPrecessRight = true;
            }else {
                currentNode.hasProcessLeft = true;
                currentNode.left = tmp;
            }

            if(tmp!=null){
                queue.add(tmp);
            }

        }

        return head;

    }

    public static void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.val +"\t");
            inorder(node.right);
        }

    }
}
