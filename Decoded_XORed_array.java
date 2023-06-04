package com.company;

import java.util.Scanner;

public class Decoded_XORed_array {
    public static int[] decode(int[] encoded,int first){
        int[] ans=new int[encoded.length+1];
        ans[0]=first;
        for(int i=0;i< encoded.length;i++){
            ans[i+1]=encoded[i]^ans[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] encoded=new int[n];
        for(int i=0;i<n;i++){
            encoded[i]= sc.nextInt();
        }
        int first= sc.nextInt();
        int[] ans=decode(encoded,first);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
