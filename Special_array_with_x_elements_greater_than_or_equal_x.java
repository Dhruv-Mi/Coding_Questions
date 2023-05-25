package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Special_array_with_x_elements_greater_than_or_equal_x {
    public static int specialArray(int[] nums){
        int n= nums.length;
        Arrays.sort(nums);
        for(int i=0;i<=nums[n-1];i++){
            int count=0;
            for (int num : nums) {
                if (num >= i) {
                    count++;
                }
            }
            if(count==i){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int ans=specialArray(nums);
        System.out.println(ans);
    }
}
