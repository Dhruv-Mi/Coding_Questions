package com.company;

import java.util.Scanner;

public class Sign_of_the_product_of_an_array {
    public static int arraySign(int[] nums){
        int negative=0;
        for (int val : nums) {
            if (val == 0) {
                return 0;
            } else if (val < 0) {
                negative++;
            }
        }
        if(negative%2==0){
            return 1;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        int ans=arraySign(nums);
        System.out.println(ans);
    }
}
