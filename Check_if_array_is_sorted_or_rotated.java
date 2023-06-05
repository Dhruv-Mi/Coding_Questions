package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Check_if_array_is_sorted_or_rotated {
    public static boolean check(int[] nums){
        ArrayList<Integer> index=new ArrayList<>();
        int value=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<value){
                index=new ArrayList<>();
                index.add(i);
                value=nums[i];
            }
            else if(nums[i]==value){
                index.add(i);
            }
        }
        for (int ind : index) {
            boolean check = true;
            int[] temp = new int[nums.length];
            int i = 0;
            for (int j = ind; j < nums.length; j++) {
                temp[i] = nums[j];
                i++;
            }
            for (int j = 0; j < ind; j++) {
                temp[i] = nums[j];
                i++;
            }
            for (int j = 1; j < temp.length; j++) {
                if (temp[j] < temp[j - 1]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        boolean ans=check(nums);
        System.out.println(ans);
    }
}
