package com.company;

import java.util.Scanner;

public class Defuse_the_bomb {
    public static int[] decrypt(int[] code,int k){
        int n= code.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            int sum=0;
            int index=i;
            while(count!=Math.abs(k)){
                if(k>0){
                    if(index+1>=n){
                        index=-1;
                    }
                    sum=sum+code[index+1];
                    index++;
                }
                else{
                    if(index==0){
                        index=n;
                    }
                    sum=sum+code[index-1];
                    index--;
                }
                count++;
            }
            ans[i]=sum;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] code=new int[n];
        for(int i=0;i<n;i++){
            code[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        int[] ans=decrypt(code,k);
        for(int element:ans){
            System.out.print(element+" ");
        }
    }
}
