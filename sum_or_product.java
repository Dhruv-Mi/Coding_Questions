package com.company;

import java.util.Scanner;

public class sum_or_product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i,sum=0,product=1;
        int choice= sc.nextInt();
        if(choice==1){
            for(i=1;i<=n;i++){
                sum+=i;
            }
            System.out.println(sum);
        }
        else if(choice==2){
            for(i=1;i<=n;i++){
                product*=i;
            }
            System.out.println(product);
        }
        else{
            System.out.println(-1);
        }
    }
}
