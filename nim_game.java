package com.company;

import java.util.Scanner;

public class nim_game {
    public static boolean canWinNim(int n) {
        return !(n % 4 == 0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        boolean ans=canWinNim(n);
        System.out.println(ans);
    }
}
