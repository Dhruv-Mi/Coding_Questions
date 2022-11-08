package com.company;

import java.util.Scanner;

public class bear_and_candies_123 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int j=1;
            int count=0;
            while(a>=0 && b>=0){
                if(j%2!=0){
                    a=a-j;
                }
                else{
                    b=b-j;
                }
                count++;
                j++;
            }
            if(count%2!=0){
                System.out.println("Bob");
            }
            else{
                System.out.println("Limak");
            }
        }
    }
}
