package com.company;

import java.util.Scanner;

public class License_key_formatting {
    public static String licenseKeyFormatting(String s,int k){
        String temp="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='-'){
                temp=(temp+ch).toUpperCase();
            }
        }
        int length=temp.length();
        String output="";
        int c=length%k;
        if(c==0){
            for(int i=0;i<length;i+=k){
                output=output+temp.substring(i,i+k)+"-";
            }
        }
        else {
            output = output + temp.substring(0, c)+"-";
            temp=temp.substring(c);
            length=temp.length();
            for(int i=0;i<length;i+=k){
                output=output+temp.substring(i,i+k)+"-";
            }
        }
        return output.substring(0,output.length()-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.next();
        int k= sc.nextInt();
        String ans=licenseKeyFormatting(input,k);
        System.out.println(ans);
    }
}
