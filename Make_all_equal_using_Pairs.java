package com.company;

import java.util.Scanner;

public class Make_all_equal_using_Pairs {
    public static int mostFrequent(int[] input){
        int ans=input[0];
        int maxcount=0;
        for (int j : input) {
            int count = 0;
            for (int k : input) {
                if (j == k) {
                    count++;
                }
            }
            if (count > maxcount) {
                maxcount = count;
                ans = j;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int[] input=new int[n];
            for(int j=0;j<n;j++){
                input[j]= sc.nextInt();
            }
            int frequent=mostFrequent(input);
            int count=0;
            for(int k=0;k<n;k++){
                if(frequent!=input[k]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
