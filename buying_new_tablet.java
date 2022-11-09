package com.company;

import java.util.Scanner;

public class buying_new_tablet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int b= sc.nextInt();
            int output=0;
            for(int j=0;j<n;j++){
                int w= sc.nextInt();
                int h= sc.nextInt();
                int p= sc.nextInt();
                if(p<=b){
                    if(output<(w*h)){
                        output=w*h;
                    }
                }
            }
            if(output==0){
                System.out.println("no tablet");
            }
            else{
                System.out.println(output);
            }
        }
    }
}
