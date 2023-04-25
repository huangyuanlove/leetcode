package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.TreeNode;

import java.util.ArrayList;

public class LeafSimilarTrees_872 {

    public static void main(String[] args) {

    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
//        [3,5,1,6,2,9,8,null,null,7,14]
//[3,5,1,6,71,4,2,null,null,null,null,null,null,9,8]

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        dfs(root1, arrayList1);
        dfs(root2, arrayList2);
        if(arrayList1.size() != arrayList2.size()) {
            return false;
        }
        for (int i = 0; i < arrayList1.size(); i++) {
            if(arrayList1.get(i) != arrayList2.get(i)){
                return false;
            }
        }


        return true;
    }
    public void dfs(TreeNode root,  ArrayList<Integer> arrayList) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            arrayList.add(root.val);

            return;
        }
        dfs(root.left, arrayList);
        dfs(root.right, arrayList);
    }
}
