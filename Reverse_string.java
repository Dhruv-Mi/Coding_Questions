package com.company;

import java.util.Scanner;

public class Reverse_string {
    public static char[] reverseString(char[] s){
        int length=s.length;
        int last=length-1;
        for(int i=0;i<length/2;i++){
            char temp=s[i];
            s[i]=s[last-i];
            s[last-i]=temp;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        char[] input=new char[n];
        for(int i=0;i<n;i++){
            input[i]=sc.next().charAt(0);
        }
        char[] output=reverseString(input);
        for (char c : output) {
            System.out.print(c + " ");
        }
    }
}
