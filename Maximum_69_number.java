package com.company;

import java.util.Scanner;

public class Maximum_69_number {
    public static int maximum69Number(int n){
        String s=n+"";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='6'){
                s=s.substring(0,i)+9+s.substring(i+1);
                break;
            }
        }
        int ans=0;
        for(int i=0;i<s.length();i++){
            ans=ans*10+((int)s.charAt(i)-48);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int ans=maximum69Number(n);
        System.out.println(ans);
    }
}
