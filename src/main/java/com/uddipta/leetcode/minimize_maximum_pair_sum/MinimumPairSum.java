package com.uddipta.leetcode.minimize_maximum_pair_sum;

import java.util.Arrays;

public class MinimumPairSum {
    public int minPairSum(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        while(i<j)
        {
            int sum = nums[i]+nums[j];
            if(sum>max)
            {
                max = sum;
            }
            i++;
            j--;
        }
        return max;
    }
}
