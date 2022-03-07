package com.uddipta.leetcode.hw1;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] expected=heights.clone();
        for(int i=1;i<expected.length;i++)
            for(int j=0;j<expected.length-i;j++)
                if(expected[j]>expected[j+1])
                {
                    int temp=expected[j];
                    expected[j]=expected[j+1];
                    expected[j+1]=temp;
                }


        int count=0;
        for(int j=0;j<heights.length;j++) {
            if (heights[j] != expected[j]) {
                count = count + 1;
            }
        }

        return count;
    }
}
