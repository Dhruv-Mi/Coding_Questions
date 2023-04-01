package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Binary_prefix_divisible_by_5 {
    public static List<Boolean> prefixesDivBy5(int[] nums){
        String s="";
        List<Boolean> ans=new ArrayList<>();
        for (int num : nums) {
            s = s + num;
            int temp = Integer.parseInt(s, 2);
            if (temp % 5 == 0) {
                ans.add(true);
            } else {
                ans.add(false);
            }
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
        List<Boolean> ans=prefixesDivBy5(nums);
        for (Boolean an : ans) {
            System.out.print(an + " ");
        }
    }
}
