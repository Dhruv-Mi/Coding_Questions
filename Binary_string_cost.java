package com.company;

import java.util.Scanner;

public class Binary_string_cost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i=0;i<t;i++){
            int n= sc.nextInt();
            int x= sc.nextInt();
            int y= sc.nextInt();
            String input= sc.next();
            int count0=0;
            int count1=0;
            for(int j=0;j<n;j++){
                char ch=input.charAt(j);
                if(ch=='0'){
                    count0++;
                }
                else{
                    count1++;
                }
            }
            if(count0==0||count1==0){
                System.out.println("0");
            }
            else {
                System.out.println(Math.min(x,y));
            }
        }
    }
}
