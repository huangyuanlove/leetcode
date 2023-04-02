package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;
import com.huangyuanlove.leetcode.helper.TreeNode;
import com.huangyuanlove.leetcode.helper.TreeNodeHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreePaths_257 {
    public static void main(String[] args) {
        TreeNode node = TreeNodeHelper.createBinaryTreeByLevel(new Integer[]{1, 2, 3, 4, 5,null,6,null,null,9,null,7,8});
        List<String> result = binaryTreePaths(node);
        ArrayListHelper.printList(result);
    }

    public static List<String> binaryTreePaths(TreeNode root) {

        ArrayList<String> result = new ArrayList<>();
        visit(root, "", result);

        return result;

    }

    public static void visit(TreeNode node, String current, ArrayList<String> list) {
        if(node.left == null && node.right == null){
            list.add(current +getResult(node,current));
        }
        if(node.left!=null){
            visit(node.left,current +getResult(node,current),list);
        }
        if(node.right!=null){
            visit(node.right,current+getResult(node,current),list);
        }


    }
    public static String getResult(TreeNode node ,String current){
        if(node == null){
            return current;
        }
        if(current == null || current.length() ==0){
            return String.valueOf(node.val);
        }
        return "->" + node.val;

    }
}
