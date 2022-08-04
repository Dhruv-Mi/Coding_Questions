package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class majority_element {
    public static int majorityElement(int[] nums){
        int len=nums.length;
        for (int temp : nums) {
            int count = 0;
            for (int num : nums) {
                if (temp == num) {
                    count++;
                }
            }
            if (count > len / 2) {
                return temp;
            }
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
        int ans=majorityElement(input);
        System.out.println(ans);
    }
}
