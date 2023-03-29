package com.huangyuanlove.leetcode;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_118 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("    ");
        List<List<Integer>> result = generate(10);
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                String str2 = df.format(result.get(i).get(j));
                System.out.print(str2 +"\t" );
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            ArrayList<Integer> current = new ArrayList<>(i);
            for (int j = 0; j < i; j++) {
                if(j ==0 || j ==i-1){
                    current.add(1);
                }else{
                    if(i>2){
                        List<Integer> pre = result.get(i-2);
                        current.add( pre.get(j-1) + pre.get(j));
                    }

                }
            }
            result.add(current);

        }


        return result;
    }
}
