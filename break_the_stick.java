package com.company;

import java.util.Scanner;

public class break_the_stick {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i=0;i<t;i++){
            int n= sc.nextInt();
            int x= sc.nextInt();
            if(n%2==0){
                System.out.println("Yes");
            }
            else if(x % 2 != 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
