package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.Node;
import com.huangyuanlove.leetcode.helper.TreeNodeHelper;

public class MaximumDepthOfNAryTree_559 {
    public static void main(String[] args) {
        Node root  = TreeNodeHelper.createNTreeByLevel(new Integer[]{1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14});
        System.out.println(maxDepth(root));

    }

    public static int maxDepth(Node root) {
        if(root == null){
            return 0;
        }
        int result = 0;
        if(root.children!=null && root.children.size()>0){
            for (int i = 0; i < root.children.size(); i++) {
               result =  Math.max( maxDepth(root.children.get(i)),result);
            }

        }
        return result+1;



    }
}
