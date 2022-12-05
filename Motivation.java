package com.company;

import java.util.Scanner;

public class Motivation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int x= sc.nextInt();
            int ans=Integer.MIN_VALUE;
            for(int j=1;j<=n;j++){
                int size= sc.nextInt();
                int rating= sc.nextInt();
                if(size<=x){
                    if(ans<=rating){
                        ans=rating;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
