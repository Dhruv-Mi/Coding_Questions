package com.company;

import java.util.Scanner;

public class Check_if_binary_string_has_at_most_one_segment_of_ones {
    public static boolean checkOnesSegment(String s){
        String[] arr=s.split("0");
        int length=arr.length;
        return length<=1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        boolean ans=checkOnesSegment(s);
        System.out.println(ans);
    }
}
