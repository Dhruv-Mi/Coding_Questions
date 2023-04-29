package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Rank_transform_of_an_array {
    public static int[] arrayRankTransform(int[] arr){
        ArrayList<Integer> temp=new ArrayList<>();
        for (int j : arr) {
            if (!temp.contains(j)) {
                temp.add(j);
            }
        }
        Collections.sort(temp);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< temp.size();i++){
            map.put(temp.get(i),i+1);
        }
        for(int i=0;i<arr.length;i++){
            int val=map.get(arr[i]);
            arr[i]=val;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int[] ans=arrayRankTransform(arr);
        for(int i : ans){
            System.out.print(i+" ");
        }
    }
}
