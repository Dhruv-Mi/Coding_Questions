package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Find_N_unique_integer_sum_up_to_zero {
    public static int[] sumZero(int n){
        int[] ans=new int[n];
        int half=n/2;
        int j=0;
        for(int i=1;i<=half;i++){
            ans[j]=-i;
            j++;
        }
        for(int i=1;i<=half;i++){
            ans[j]=i;
            j++;
        }
        if(n%2!=0){
            ans[j]=0;
        }
        Arrays.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] ans=sumZero(n);
        for(int elem : ans){
            System.out.print(elem+" ");
        }
    }
}
