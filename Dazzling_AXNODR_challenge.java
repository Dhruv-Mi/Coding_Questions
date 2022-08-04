package com.company;

import java.util.Scanner;

public class Dazzling_AXNODR_challenge {
    public static int andnxor(int n){
        int b=1;
        for(int j=2;j<=n;j++){
            if(j%2==0){
                b=b^j;
            }
            else{
                b=b&j;
            }
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int ans=andnxor(n);
            System.out.println(ans);
        }
    }
}
