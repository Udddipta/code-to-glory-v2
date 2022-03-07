package com.uddipta.leetcode.max_wealth;

public class MaximumWealth {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        int sum=0;
        for(int i=0; i<accounts.length; i++)
        {
            for(int j=0; j<accounts[0].length; j++)
            {
                sum = sum+accounts[i][j];
            }
            if(sum>max)
            {
                max =sum;
            }
            sum=0;
        }
        return max;
    }
}
