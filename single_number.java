package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class single_number {
    public static int singleNumber(int[] nums){
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hash.containsKey(nums[i])){
                int value=hash.get(nums[i]);
                hash.put(nums[i],++value);
            }
            else {
                hash.put(nums[i],1);
            }
        }
        for(int i=0;i<nums.length;i++){
            int value=hash.get(nums[i]);
            if(value==1){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        int ans=singleNumber(input);
        System.out.println(ans);
    }
}
