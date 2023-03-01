package com.company;

import java.util.Scanner;

public class bit_character {
    public static boolean isOneBitCharacter(int[] bits){
        int length= bits.length;
        for(int i=0;i<length;++i){
            if(i==length-1 && bits[i]==0){
                return true;
            }
            if(bits[i]==1){
                ++i;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] bits=new int[n];
        for(int i=0;i<n;i++){
            bits[i]= sc.nextInt();
        }
        boolean ans=isOneBitCharacter(bits);
        System.out.println(ans);
    }
}
