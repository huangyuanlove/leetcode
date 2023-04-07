package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;
import com.huangyuanlove.leetcode.helper.Node;
import com.huangyuanlove.leetcode.helper.TreeNodeHelper;

import java.util.ArrayList;
import java.util.List;

public class NAryTreePostorderTraversal_590 {
    public static void main(String[] args) {
        Node root = TreeNodeHelper.createNTreeByLevel(new Integer[]{1,null,3,2,4,null,5,6});
        List<Integer> result = postorder(root);
        ArrayListHelper.printList(result);
    }
    public static List<Integer> postorder(Node root) {

        ArrayList<Integer> result = new ArrayList<>();
        visit(root,result);

        return result;

    }
    public static void visit(Node root, ArrayList<Integer> result){
        if(root!=null){

            if(root.children!=null && root.children.size() > 0){
                for (int i = 0; i < root.children.size(); i++) {
                    visit(root.children.get(i),result);

                }
            }
            result.add(root.val);

        }

    }
}
