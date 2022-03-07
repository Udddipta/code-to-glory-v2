package com.uddipta.leetcode.easy.running_sum;

public class RunningSum {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int[] sumArr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            sumArr[i]=sum;
        }
        return sumArr;
    }
}
