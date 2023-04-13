package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;
import com.huangyuanlove.leetcode.helper.TreeNode;
import com.huangyuanlove.leetcode.helper.TreeNodeHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoSumIvInputIsABst_653 {
    public static void main(String[] args) {

        TreeNode root = TreeNodeHelper.createBinaryTreeByLevel(new Integer[]{0,-2,3,null,-1,null,4});
        System.out.println(findTarget(root,-2));
    }

    public static boolean findTarget(TreeNode root, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        visit(root,map);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int current = entry.getKey();
            int diff = k-current;
            if(map.containsKey(diff)){
                //是不是相同
                if(diff == current){
                    if(map.get(diff)>1){
                        return true;
                    }

                }else{
                    return true;
                }
            }

        }
        return false;
    }

    public static void visit(TreeNode root, HashMap<Integer,Integer> map){
        if(root!=null){
            visit(root.left,map);
            if(map.containsKey(root.val)){
                map.put(root.val, map.get(root.val)+1);
            }else{
                map.put(root.val,1);
            }

            visit(root.right,map);
        }
    }
}
