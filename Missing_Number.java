package com.company;

import java.util.Scanner;

public class Missing_Number {
    public static int missingnumber(int[] nums){
        int n=nums.length;
        int k=0;
        while(k<=n){
            int check=0;
            for(int i=0;i<n;i++){
                if(k==nums[i]){
                    check=1;
                }
            }
            if(check==0){
                return k;
            }
            else{
                k++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        int ans=missingnumber(input);
        System.out.println(ans);
    }
}
