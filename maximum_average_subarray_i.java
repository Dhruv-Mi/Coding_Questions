package com.company;

import java.util.Scanner;

public class maximum_average_subarray_i {
    public  static double findMaxAverage(int[] nums,int k){
        double sum = 0;
        for (int i = 0; i < k; ++i)
            sum += nums[i];
        double ans = sum;

        for (int i = k; i < nums.length; ++i) {
            sum += nums[i] - nums[i - k];
            ans = Math.max(ans, sum);
        }

        return ans / k;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
        int k= sc.nextInt();
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        double ans=findMaxAverage(input,k);
        System.out.println(ans);
    }
}
