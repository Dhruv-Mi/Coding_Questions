package com.company;

import java.util.Scanner;

public class Divisible_by_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int count=0;
            while(a%3!=0&&b%3!=0){
                int temp=a-b;
                if(temp<0){
                    temp=temp*-1;
                    a=temp;
                    b=temp;
                }
                else{
                    a=temp;
                    b=temp;
                }
                count++;
            }
            System.out.println(count);
        }
    }
}
