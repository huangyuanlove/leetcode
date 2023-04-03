package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;
import com.huangyuanlove.leetcode.helper.TreeNodeHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.ToIntFunction;

public class FindModeInBinarySearchTree_501 {

    public static void main(String[] args) {
        TreeNode root = TreeNodeHelper.createBinaryTreeByLevel(new Integer[]{1,null,2,2});
        findMode(root);
    }

    public static int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        visit(root,map);
        int maxCount = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                result.clear();
                result.add(entry.getKey());
            }else if(entry.getValue() == maxCount){
                result.add(entry.getKey());
            }
        }
       return result.stream().mapToInt(new ToIntFunction<Integer>() {
           @Override
           public int applyAsInt(Integer value) {
               return value;
           }
       }).toArray();
    }

    public static void visit(TreeNode node, HashMap<Integer,Integer> map){
        if(node!=null){
            visit(node.left,map);
            if(map.containsKey(node.val)){
                map .put(node.val,map.get(node.val)+1);
            }else{
                map.put(node.val,1);
            }
            visit(node.right,map);
        }
    }

}
