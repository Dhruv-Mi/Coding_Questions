package com.company;

import java.util.Scanner;

public class Find_number_with_even_number_of_digits {
    public static int findNumbers(int[] nums){
        int ans=0;
        for (int num : nums) {
            String s = "" + num;
            if (s.length() % 2 == 0) {
                ans++;
            }
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
        int ans=findNumbers(nums);
        System.out.println(ans);
    }
}
