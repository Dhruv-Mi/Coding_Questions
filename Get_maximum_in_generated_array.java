package com.company;

import java.util.Scanner;

public class Get_maximum_in_generated_array {
    public static int getMaximumGenerated(int n){
        int[] nums=new int[n+1];
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else {
            nums[0] = 0;
            nums[1] = 1;
            int ans = Integer.MIN_VALUE;
            for (int i = 1; i <= n / 2; i++) {
                int index1 = i * 2;
                int index2 = i * 2 + 1;
                if (index1 <= n) {
                    nums[index1] = nums[i];
                    ans = Math.max(ans, nums[index1]);
                }
                if (index2 <= n) {
                    nums[index2] = nums[i] + nums[i + 1];
                    ans = Math.max(ans, nums[index2]);
                }
            }
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int ans=getMaximumGenerated(n);
        System.out.println(ans);
    }
}
