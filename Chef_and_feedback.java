package com.company;

import java.util.Scanner;

public class Chef_and_feedback {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i=0;i<t;i++){
            String input= sc.next();
            if(input.contains("010")||input.contains("101")){
                System.out.println("Good");
            }
            else{
                System.out.println("Bad");
            }
        }
    }
}
