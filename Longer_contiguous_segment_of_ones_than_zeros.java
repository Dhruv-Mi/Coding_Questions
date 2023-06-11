package com.company;

import java.util.Scanner;

public class Longer_contiguous_segment_of_ones_than_zeros {
    public static boolean checkZeroOnes(String s){
        String[] temp1=s.split("0");
        String[] temp0=s.split("1");
        int ans1=0;
        for (String temp : temp1) {
            ans1 = Math.max(ans1, temp.length());
        }
        int ans0=0;
        for(String temp : temp0){
            ans0=Math.max(ans0,temp.length());
        }
        return ans1>ans0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        boolean ans=checkZeroOnes(s);
        System.out.println(ans);
    }
}
