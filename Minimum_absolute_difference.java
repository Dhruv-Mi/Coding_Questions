package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Minimum_absolute_difference {
    public static List<List<Integer>> minimumAbsoluteDifference(int[] arr){
        Arrays.sort(arr);
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int temp=arr[i+1]-arr[i];
            if(temp<=diff){
                diff=temp;
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            List<Integer> temp=new ArrayList<>();
            int check=arr[i+1]-arr[i];
            if(diff==check){
                temp.add(arr[i]);
                temp.add(arr[i+1]);
                ans.add(temp);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<List<Integer>> ans=minimumAbsoluteDifference(arr);
        for (List<Integer> an : ans) {
            System.out.println(an.get(0) + " " + an.get(1));
        }
    }
}
