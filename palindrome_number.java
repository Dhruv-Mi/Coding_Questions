package com.company;

import java.util.Scanner;

public class palindrome_number {
    public static boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        else{
            int temp=0;
            int temp2=x;
            while(x!=0){
                temp=(temp*10)+(x%10);
                x=x/10;
            }
            return temp == temp2;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        boolean ans=isPalindrome(n);
        System.out.println(ans);
    }
}
