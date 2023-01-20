package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Relative_ranks {
    public static String[] findRelativeRanks(int[] score){
        int[] temp=new int[score.length];
        System.arraycopy(score, 0, temp, 0, score.length);
        Arrays.sort(score);
        String[] ans=new String[temp.length];
        int k=1;
        for(int i= temp.length-1;i>=0;i--){
            int num1=score[i];
            for(int j=0;j< temp.length;j++){
                int num2=temp[j];
                if(num1==num2){
                    if(k==1){
                        ans[j]="Gold Medal";
                    }
                    else if(k==2){
                        ans[j]="Silver Medal";
                    }
                    else if(k==3){
                        ans[j]="Bronze Medal";
                    }
                    else{
                        ans[j]=""+k;
                    }
                    k++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        String[] ans=findRelativeRanks(input);
        for(String s:ans){
            System.out.print(s+" ");
        }
    }
}
