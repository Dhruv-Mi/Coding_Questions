package com.company;

import java.util.Scanner;

public class Problem_7 {
    public static void result(String str){
        StringBuilder temp= new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z'){
                System.out.println(temp);
                temp = new StringBuilder(("" + ch).toLowerCase());
            }
            else{
                temp.append(("" + ch).toUpperCase());
            }
        }
        System.out.println(temp);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        result(str);
    }
}
