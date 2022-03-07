package com.uddipta.leetcode.hw2;

import java.util.Arrays;

public class MaximumUnits {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1],a[1]));
        int maxUnits=0;
        for(int i=0;i<boxTypes.length;i++)
        {
            if(truckSize >= boxTypes[i][0])
            {
                maxUnits=maxUnits+(boxTypes[i][0]*boxTypes[i][1]);
                truckSize=truckSize-boxTypes[i][0];
            }
            else
            {
                maxUnits=maxUnits+(truckSize *boxTypes[i][1]);
                truckSize=0;
            }
        }
        return maxUnits;
    }
}
