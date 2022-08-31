package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class contains_duplicate_2 {
    public static boolean containsNearbyDuplicate(int[] nums,int k){
        int len= nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<len;i++){
            if(map.containsKey(nums[i])){
                int temp=i-map.get(nums[i]);
                if(Math.abs(temp)<=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        boolean ans=containsNearbyDuplicate(input,k);
        System.out.println(ans);
    }
}
