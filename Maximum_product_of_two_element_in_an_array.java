package com.company;

import java.util.Scanner;

public class Maximum_product_of_two_element_in_an_array {
    public static int maxProduct(int[] nums){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                ans=Math.max(ans,(nums[i]-1)*(nums[j]-1));
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
        int ans=maxProduct(nums);
        System.out.println(ans);
    }
}
