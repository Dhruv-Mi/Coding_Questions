package com.company;

import java.util.Scanner;

public class Equalize_AB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i=0;i<t;i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int x= sc.nextInt();
            if(a==b){
                System.out.println("Yes");
            }
            else if(a<b){
                boolean check=true;
                while(a<b){
                    a=a+x;
                    b=b-x;
                    if(a==b){
                        System.out.println("Yes");
                        check=false;
                        break;
                    }
                }
                if(check){
                    System.out.println("No");
                }
            }
            else{
                boolean check=true;
                while(b<a){
                    a=a-x;
                    b=b+x;
                    if(a==b){
                        System.out.println("Yes");
                        check=false;
                        break;
                    }
                }
                if(check){
                    System.out.println("No");
                }
            }
        }
    }
}
