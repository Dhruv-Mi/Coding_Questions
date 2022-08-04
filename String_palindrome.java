package com.company;

import java.util.Scanner;

public class String_palindrome {
    public static boolean isPalindrome(String str){
        String str2="";
        int i;
        for(i=0;i<str.length();i++){
            str2 = str.charAt(i) + str2;
        }
        if(str.equals(str2)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str= sc.nextLine();
        boolean check=isPalindrome(str);
        System.out.println(check);
    }
}
