package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Remove_Duplicates_from_sorted_Array {
    public static int removeDuplicates(int[] nums){
        int len= nums.length;
        int[] temp=new int[len];
        int k=0;
        HashMap<Integer,Integer> pending=new HashMap<>();
        for (int j : nums) {
            if (!pending.containsKey(j)) {
                pending.put(j,1);
                temp[k]=j;
                k++;
            }
        }
        int ans=0;
        for (int num : nums) {
            if (pending.containsKey(num)) {
                ans++;
                pending.remove(num);
            }
        }
        nums=temp;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        int ans=removeDuplicates(input);
        System.out.println(ans);
    }
}
