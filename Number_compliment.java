package com.company;

import java.util.Scanner;

public class Number_compliment {
    public static int findCompliment(int num){
        String temp=Integer.toBinaryString(num);
        StringBuilder ans_str= new StringBuilder();
        for(int i=0;i<temp.length();i++){
            char ch=temp.charAt(i);
            if(ch=='1'){
                ans_str.append('0');
            }
            else{
                ans_str.append('1');
            }
        }
        int ans=0;
        int c=0;
        for(int i=ans_str.length()-1;i>=0;i--){
            int check=(int)ans_str.charAt(i)-'0';
            ans= ans+(int) (check*(Math.pow(2,c)));
            c++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int ans=findCompliment(n);
        System.out.println(ans);
    }
}
