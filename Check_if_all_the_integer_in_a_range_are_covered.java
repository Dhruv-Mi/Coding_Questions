package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Check_if_all_the_integer_in_a_range_are_covered {
    public static boolean isCovered(int[][] ranges,int left,int right){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=left;i<=right;i++){
            map.put(i,0);
        }
        for (int[] range : ranges) {
            for(int j=range[0];j<=range[1];j++){
                if(left<=j && j<=right){
                    map.put(j,1);
                }
            }
        }
        for(int i=left;i<=right;i++){
            if(map.get(i)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] ranges=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                ranges[i][j]= sc.nextInt();
            }
        }
        int left= sc.nextInt();
        int right= sc.nextInt();
        boolean ans=isCovered(ranges,left,right);
        System.out.println(ans);
    }
}
