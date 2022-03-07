package com.uddipta.leetcode.hw3;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        if(arr.length <=2){
            if(arr[0] == arr[arr.length - 1])
                return true;
            return false;
        }
        Arrays.sort(arr);
        int count = 1;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == arr[i + 1]){
                count++;
            }else{
                if(set.contains(count)){
                    return false;
                }else{
                    set.add(count);
                }
                count= 1;
            }
        }
        return true;
    }
}
