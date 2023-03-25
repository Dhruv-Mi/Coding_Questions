package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Sort_array_by_parity {
    public static int[] sortArrayByParity(int[] nums){
        int n= nums.length;
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        even.addAll(odd);
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]= even.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int[] ans=sortArrayByParity(nums);
        for(int i : ans){
            System.out.print(i+" ");
        }
    }
}
