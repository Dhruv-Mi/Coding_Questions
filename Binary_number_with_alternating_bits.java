package com.company;

import java.util.Scanner;

public class Binary_number_with_alternating_bits {
    public static boolean hasAlternatingBits(int n){
        String binary=Integer.toBinaryString(n);
        for(int i=1;i<binary.length();i++){
            char current=binary.charAt(i);
            char previous=binary.charAt(i-1);
            if(current==previous){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        boolean ans=hasAlternatingBits(n);
        System.out.println(ans);
    }
}
