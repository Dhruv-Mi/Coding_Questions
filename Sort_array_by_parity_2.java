package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Sort_array_by_parity_2 {
    public static int[] sortArrayByParityII(int[] nums){
        int length= nums.length;
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        int[] ans=new int[length];
        int even_index=0;
        int odd_index=0;
        for(int i=0;i<length;i++){
            if(i%2==0){
                ans[i]=even.get(even_index);
                even_index++;
            }
            else{
                ans[i]=odd.get(odd_index);
                odd_index++;
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
        int[] ans=sortArrayByParityII(nums);
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
}
