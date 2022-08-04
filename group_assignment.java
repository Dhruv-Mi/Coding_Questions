package com.company;

import java.util.Scanner;

public class group_assignment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        int ans=0;
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int[] input=new int[n];
            for(int j=0;j<n;j++){
                input[j]= sc.nextInt();
            }
            for(int j=0;j<n;j++){
                int temp=input[j];
                int count=0;
                for(int k=0;k<n;k++){
                    if(temp==input[k]){
                        count++;
                    }
                }
                if(temp!=count){
                    ans=1;
                    break;
                }
            }
            if(ans==1){
                System.out.println("no");
            }
            else{
                System.out.println("yes");
            }
        }
    }
}
