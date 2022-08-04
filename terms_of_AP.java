package com.company;

import java.util.Scanner;

public class terms_of_AP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i,k=1;
        for(i=1;i<=n;i++){
            int value=3*k+2;
            if(value%4==0){
                i--;
            }
            else{
                System.out.print(value+" ");
            }
            k++;
        }
    }
}
