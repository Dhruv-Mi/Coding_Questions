package com.company;

import java.util.Scanner;

public class Problem_2 {
    public static int operationsBinaryStrings(String str){
        for(int i=1;i<str.length();i++){
            char ch1=str.charAt(i-1);
            char ch2=str.charAt(i+1);
            int temp;
            if(str.charAt(i)=='A'){
                temp=Integer.parseInt(ch1+"")&Integer.parseInt(ch2+"");
                str=temp+str.substring(i+2);
            }
            else if(str.charAt(i)=='B'){
                temp=Integer.parseInt(ch1+"")|Integer.parseInt(ch2+"");
                str=temp+str.substring(i+2);
            }
            else{
                temp=Integer.parseInt(ch1+"")^Integer.parseInt(ch2+"");
                str=temp+str.substring(i+2);
            }
            i--;
        }
        return Integer.parseInt(str);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        int ans=operationsBinaryStrings(str);
        System.out.println(ans);
    }
}
