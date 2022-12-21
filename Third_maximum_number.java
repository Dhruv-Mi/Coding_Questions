package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Third_maximum_number {
    public static int thirdMax(int[] nums){
        int n = nums.length;
        Arrays.sort(nums);
        int idx = n - 1 , i , distinctCount = 0;
        while(idx >= 0)
        {
            distinctCount++;
            i = idx - 1;
            while(i >= 0 && nums[i] == nums[idx])
                i--;
            if(i == -1)
                return nums[n - 1];
            idx = i;
            if(distinctCount == 2)
                return nums[idx];
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
        int ans=thirdMax(input);
        System.out.println(ans);
    }
}
