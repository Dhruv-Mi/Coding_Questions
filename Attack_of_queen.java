package com.company;

import java.util.Scanner;

public class Attack_of_queen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i=0;i<t;i++){
            int n= sc.nextInt();
            int x= sc.nextInt();
            int y= sc.nextInt();
            int count=0;
            for (int j=1;j<=n;j++){
                for (int k=1;k<=n;k++){
                    if(x==j || y==k){
                        count++;
                    }
                    else if(Math.abs(j-x)==Math.abs(k-y)){
                        count++;
                    }
                }
            }
            System.out.println(count-1);
        }
    }
}
