package com.company;

import java.util.Scanner;

public class pass_the_exam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            int sum=a+b+c;
            if(sum>=100 && a>=10 && b>=10 && c>=10){
                System.out.println("PASS");
            }
            else{
                System.out.println("FAIL");
            }
        }
    }
}
