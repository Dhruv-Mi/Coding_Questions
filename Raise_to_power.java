package com.company;

import java.util.Scanner;

public class Raise_to_power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int power= sc.nextInt();
        int pro=1;
        for(int i=1;i<=power;i++){
            pro=pro*num;
        }
        System.out.println(pro);
    }
}
