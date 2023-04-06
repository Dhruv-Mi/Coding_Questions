package com.company;

import java.util.Scanner;

public class Defanging_an_IP_address {
    public static String defangIPAddr(String address){
        return address.replaceAll("\\.","[.]");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String address= sc.next();
        String ans=defangIPAddr(address);
        System.out.println(ans);
    }
}
