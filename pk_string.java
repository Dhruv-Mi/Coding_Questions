package com.company;

import java.util.Scanner;

public class pk_string {
    public static int pkString(int k,String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='p'){
                count++;
            }
        }
        if(k==count){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n= sc.nextInt();
            int k= sc.nextInt();
            String input= sc.next();
            int ans=pkString(k,input);
            System.out.println(ans);
        }
    }
}
