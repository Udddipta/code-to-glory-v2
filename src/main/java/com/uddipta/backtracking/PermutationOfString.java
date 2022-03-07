package com.uddipta.backtracking;

import  java.util.Scanner;

public class PermutationOfString {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        findPermutations(str,0,str.length()-1);
    }

    private static void findPermutations(String str,int left,int right)
    {
        if(left == right)
        {
            System.out.println(str);
        }
        else
        {
            for(int i=left;i<=right;i++)
            {
                str = swap(str,left,i);
                findPermutations(str,left+1,right);
                str = swap(str,left,i);
            }
        }
    }

    private static String swap(String str,int ch1,int ch2)
    {
        char t;
        char[] arr = str.toCharArray();
        t = arr[ch1];
        arr[ch1] = arr[ch2];
        arr[ch2] = t;
        return String.valueOf(arr);
    }
}
