package com.huangyuanlove.leetcode.helper;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class TreeNodeHelper {

    public static void main(String[] args) {
        TreeNode result = createBinaryTreeByLevel(new Integer[]{1,2,2,null,3,null,3});
        inorder(result);
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
        TreeNode currentNode = null;
        TreeNode head = new TreeNode(nodes[0]);
        queue.add(head);
        Integer currentValue;

        for (int i = 1; i < nodes.length; i++) {
            currentValue = nodes[i];
            if(currentNode == null){
                if(currentValue !=null){
                    TreeNode tmp = new TreeNode(currentValue);
                    //当前node为空，当前值不空
                    if(!queue.isEmpty()){
                        currentNode = queue.poll();
                        if(currentNode.hasProcessLeft){
                            currentNode.right = tmp;
                            currentNode = null;
                        }else{
                            currentNode.left =tmp;
                            currentNode.hasProcessLeft = true;
                        }
                    }else{
                        //不能为空，否则不知道当前值创建的node挂在哪里
                    }
                    queue.add(tmp);

                }else{
                    //当前值为空，当前node为空
                    if(!queue.isEmpty()){
                        currentNode = queue.poll();
                        if(currentNode.hasProcessLeft){
                            currentNode.right = null;
                            currentNode = null;
                        }else{
                            currentNode.left = null;
                            currentNode.hasProcessLeft = true;
                        }
                    }

                }
            }else{

                if(currentValue !=null){
                    //当前node不空，当前值不空
                    TreeNode tmp = new TreeNode(currentValue);
                    if(currentNode.hasProcessLeft){
                        currentNode.right = tmp;
                        currentNode = null;

                    }else{
                        currentNode.left =tmp;
                        currentNode.hasProcessLeft = true;
                    }
                    queue.add(tmp);
                }else{
                    //当前值为空，当前node为空，不处理
                    if(!queue.isEmpty()){
                        currentNode = queue.poll();
                        if(currentNode.hasProcessLeft){
                            currentNode.right = null;
                            currentNode = null;
                        }else{
                            currentNode.left = null;
                            currentNode.hasProcessLeft = true;
                        }
                    }
                }
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
