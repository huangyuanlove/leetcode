package com.huangyuanlove.leetcode.helper;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class TreeNodeHelper {

    public static void main(String[] args) {
        TreeNode result = createBinaryTreeByLevel(new Integer[]{1, 2, 2, null, 3, null, 3});
        TreeNode root = createBinaryTreeByLevel(new Integer[]{3, 9, 20, null, null, 15, 7});


        createNTreeByLevel(new Integer[]{1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14});
    }


    public static TreeNode createBinaryTreeByLevel(Integer[] nodes) {
        LinkedBlockingQueue<TreeNode> queue = new LinkedBlockingQueue<>();

        TreeNode head = new TreeNode(nodes[0]);
        TreeNode currentNode = head;
        queue.add(head);
        Integer currentValue;

        for (int i = 1; i < nodes.length; i++) {
            currentValue = nodes[i];
            TreeNode tmp = null;
            if (currentValue != null) {
                tmp = new TreeNode(currentValue);
            }

            while (currentNode.hasPrecessRight) {
                currentNode = queue.poll();
            }
            if (currentNode.hasProcessLeft) {
                currentNode.right = tmp;
                currentNode.hasPrecessRight = true;
            } else {
                currentNode.hasProcessLeft = true;
                currentNode.left = tmp;
            }

            if (tmp != null) {
                queue.add(tmp);
            }

        }

        return head;

    }

//1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14

    public static Node createNTreeByLevel(Integer[] nodes) {
        if(nodes == null || nodes.length == 0){
            return null;
        }
        ArrayList<ArrayList<Integer>> levels = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        for (int i = 0; i < nodes.length; i++) {
            if(nodes[i] ==null){

                levels.add(current);
                current = new ArrayList<>();
            }else{
                current.add(nodes[i]);
            }

        }
        if(current.size()>0){
            levels.add(current);
        }


        LinkedBlockingQueue<Node> queue = new LinkedBlockingQueue<>();
        Node root  = new Node(levels.get(0).get(0));
        queue.add(root);
        for (int i = 1; i < levels.size(); i++) {
            Node pre = queue.poll();
            ArrayList<Integer> childrenValues =levels.get(i);
            ArrayList<Node> childrenNode =null;
            if(childrenValues != null && childrenValues.size()>0){
                childrenNode = new ArrayList<>();
                for (int j = 0; j < childrenValues.size(); j++) {
                    Integer value = childrenValues.get(j);
                    Node node = new Node(value);
                    queue.add(node);
                    childrenNode.add(node);
                }
            }
            pre.children = childrenNode;
        }
        return root;
    }


    public static void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.val + "\t");
            inorder(node.right);
        }
    }

    public static void levelVisit(TreeNode node){
        LinkedBlockingQueue<TreeNode> queue = new LinkedBlockingQueue<>();


        queue.add(node);
        int preLevelCount = 1;
        int currentLevelCount =0;

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val +"\t");
            preLevelCount --;

            if(current.left !=null){
                queue.add(current.left);
                currentLevelCount ++;
            }
            if(current.right!=null){
                queue.add(current.right);
                currentLevelCount ++;
            }

            if(preLevelCount == 0){

                System.out.println();
                preLevelCount = currentLevelCount;
                currentLevelCount = 0;
            }
        }

    }

}
