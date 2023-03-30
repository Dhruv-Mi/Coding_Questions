package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Largest_perimeter_triangle {
    public static int largestPerimeter(int[] nums){
        int n= nums.length;
        Arrays.sort(nums);
        for(int i=n-1;i>=2;i--){
            if(nums[i]<nums[i-1]+nums[i-2]){
                return nums[i]+nums[i-1]+nums[i-2];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        int ans=largestPerimeter(nums);
        System.out.println(ans);
    }
}
