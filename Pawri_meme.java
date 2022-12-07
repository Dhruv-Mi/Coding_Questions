package com.company;

import java.util.Scanner;

public class Pawri_meme {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i=0;i<t;i++){
            String input= sc.next();
            String output=input.replace("party","pawri");
            System.out.println(output);
        }
    }
}
