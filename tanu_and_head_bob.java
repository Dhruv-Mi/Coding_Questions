package com.company;

import java.util.Scanner;

public class tanu_and_head_bob {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            String input=sc.next();
            int countY=0;
            int countI=0;
            for(int j=0;j<n;j++){
                char ch=input.charAt(j);
                if(ch=='Y'){
                    countY++;
                }
                else if(ch=='I'){
                    countI++;
                }
            }
            if(countI == 0 && countY!=0){
                System.out.println("NOT INDIAN");
            }
            else if(countY == 0 && countI!=0){
                System.out.println("INDIAN");
            }
            else{
                System.out.println("NOT SURE");
            }
        }
    }
}
