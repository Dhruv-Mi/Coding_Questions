package com.company;

import java.util.Scanner;

public class Count_the_ACs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int count=0;
            int temp=n;
            while(temp!=0){
                if(temp>=100){
                    temp=temp-100;
                }
                else{
                    temp=temp-1;
                }
                count++;
            }
            if(count<=10){
                System.out.println(count);
            }
            else {
                System.out.println(-1);
            }
        }
    }
}
