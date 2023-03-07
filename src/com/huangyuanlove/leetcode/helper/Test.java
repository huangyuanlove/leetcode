package com.huangyuanlove.leetcode.helper;

import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {



    }


    private static void traverse(TreeNode node) {
        if (node != null) {


            traverse(node.left);
            System.out.print(node.val + "\t");
            traverse(node.right);
        }
    }


    private static TreeNode generateTree() {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(8);
        TreeNode i = new TreeNode(9);
        TreeNode j = new TreeNode(10);
        TreeNode k = new TreeNode(11);
        TreeNode l = new TreeNode(12);
        TreeNode m = new TreeNode(13);
        TreeNode n = new TreeNode(14);


        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        d.left = h;
        d.right = i;
        e.left = j;
        e.right = k;
        f.left = l;
        f.right = m;
        g.left = n;


        return a;


    }

    private static TreeNode autoGenerate(int maxNum) {
        TreeNode root = new TreeNode(1);

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (i <= maxNum) {
            TreeNode treeNode = queue.poll();
            if (i + 1 <= maxNum) {
                TreeNode left = new TreeNode(++i);
                treeNode.left = left;
                queue.add(left);
            }else{i++;}
            if (i + 1 <= maxNum) {
                TreeNode right = new TreeNode(++i);
                treeNode.right = right;
                queue.add(right);
            }else{i++;}
        }
        return root;

    }

}
