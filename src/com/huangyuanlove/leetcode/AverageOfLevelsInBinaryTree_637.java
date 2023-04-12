package com.huangyuanlove.leetcode;

import com.huangyuanlove.leetcode.helper.ArrayListHelper;
import com.huangyuanlove.leetcode.helper.TreeNode;
import com.huangyuanlove.leetcode.helper.TreeNodeHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

public class AverageOfLevelsInBinaryTree_637 {
    public static void main(String[] args) {
        TreeNode node = TreeNodeHelper.createBinaryTreeByLevel(new Integer[]{3, 9, 20, null, null, 15, 7});
        ArrayListHelper.printList(averageOfLevels(node));
    }

    public static List<Double> averageOfLevels(TreeNode root) {
        LinkedBlockingQueue<TreeNode> queue = new LinkedBlockingQueue<>();
        ArrayList<Double> result = new ArrayList<>();

        queue.add(root);
        int preLevelCount = 1;
        int preLevelCountCopy = preLevelCount;
        int currentLevelCount =0;
        double currentLevelSum = 0;

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val +"\t");
            currentLevelSum += current.val;
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
                result.add(currentLevelSum / preLevelCountCopy);
                preLevelCountCopy = currentLevelCount;
                preLevelCount = currentLevelCount;
                currentLevelCount = 0;
                currentLevelSum = 0;
            }
        }
        return result;
    }
}
