package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Decompress_run_length_encoded_list {
    public static int[] decompressRLElist(int[] nums){
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i< nums.length;i+=2){
            int freq=nums[i];
            int val=nums[i+1];
            for(int j=0;j<freq;j++){
                arr.add(val);
            }
        }
        int[] ans=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        int[] ans=decompressRLElist(nums);
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
}
