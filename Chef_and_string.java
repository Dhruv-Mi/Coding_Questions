package com.company;

import java.util.Scanner;

public class Chef_and_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i=0;i<t;i++){
            String input= sc.next();
            if(input.length()<=2){
                System.out.println("Yes");
            }
            else {
                char ch_first=input.charAt(0);
                char ch_last=input.charAt(input.length()-1);
                String left = input.substring(1) + ch_first;
                String right = ch_last + input.substring(0, input.length() - 1);
                if (left.equals(right)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}
