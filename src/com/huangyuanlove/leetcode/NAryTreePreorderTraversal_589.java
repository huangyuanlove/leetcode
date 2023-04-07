package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;
import com.huangyuanlove.leetcode.helper.Node;
import com.huangyuanlove.leetcode.helper.TreeNodeHelper;

import java.util.ArrayList;
import java.util.List;

public class NAryTreePreorderTraversal_589 {

    public static void main(String[] args) {
        Node root = TreeNodeHelper.createNTreeByLevel(new Integer[]{1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14});
        List<Integer> result = preorder(root);
        ArrayListHelper.printList(result);
    }
    public  static List<Integer> preorder(Node root) {
         ArrayList<Integer> result = new ArrayList<>();
        visit(root,result);


        return result;

    }
    public static void visit(Node root,ArrayList<Integer> result){
        if(root!=null){
            result.add(root.val);
            if(root.children!=null && root.children.size() > 0){
                for (int i = 0; i < root.children.size(); i++) {
                    visit(root.children.get(i),result);
                }
            }
        }

    }
}
