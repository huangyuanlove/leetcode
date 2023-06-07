package com.huangyuanlove.leetcode;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary_1491 {
    public static void main(String[] args) {

    }
    public double average(int[] salary) {
        int max = 0;
        int min =Integer.MAX_VALUE;
        int sum = 0;
        for (int s :
                salary) {
            max = Math.max(s, max);
            min = Math.min(s,min);
            sum += s;
        }


        return (sum - min - max ) * 1.0 / (salary.length-2);

    }
}
