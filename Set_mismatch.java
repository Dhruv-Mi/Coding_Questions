package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Set_mismatch {
    public static int[] findErrorNums(int[] nums){
        int length= nums.length;
        int[] ans=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int i=1;i<=length;i++){
            if(!map.containsKey(i)){
                ans[1]=i;
            }
            if(map.containsKey(i) && map.get(i)==2){
                ans[0]=i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        int[] ans=findErrorNums(input);
        System.out.println(ans[0]+" "+ans[1]);
    }
}
