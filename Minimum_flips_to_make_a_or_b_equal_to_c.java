package com.company;

import java.util.Scanner;

public class Minimum_flips_to_make_a_or_b_equal_to_c {
    public static int minFlips(int a,int b,int c){
        int ans=0;
        String binaryA=Integer.toBinaryString(a);
        String binaryB=Integer.toBinaryString(b);
        String binaryC=Integer.toBinaryString(c);
        int length=Math.max(binaryA.length(),Math.max(binaryB.length(),binaryC.length()));
        if(binaryA.length()<length){
            binaryA= "0".repeat(length - binaryA.length()) +binaryA;
        }
        if(binaryB.length()<length){
            binaryB= "0".repeat(length - binaryB.length()) +binaryB;
        }
        if(binaryC.length()<length){
            binaryC= "0".repeat(length - binaryC.length()) +binaryC;
        }
        for(int i=0;i<length;i++){
            char chA=binaryA.charAt(i);
            char chB=binaryB.charAt(i);
            char chC=binaryC.charAt(i);
            if(chC=='0'){
                if(chA=='1'){
                    ans++;
                }
                if(chB=='1'){
                    ans++;
                }
            }
            else{
                if(chA=='0' && chB=='0'){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int ans=minFlips(a,b,c);
        System.out.println(ans);
    }
}
