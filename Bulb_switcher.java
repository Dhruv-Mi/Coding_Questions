package com.company;

import java.util.Scanner;

public class Bulb_switcher {
    public static int bulbSwitch(int n){
        return (int)Math.sqrt(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int ans=bulbSwitch(n);
        System.out.println(ans);
    }
}
