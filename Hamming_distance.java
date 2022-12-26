package com.company;

import java.util.Scanner;

public class Hamming_distance {
    public static int hammingDistance(int x,int y){
        int xor = x^y;
        int count = 0;
        while (xor > 0) {
            if ((xor&1) == 1) {
                count ++;
            }
            xor = xor >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        int ans=hammingDistance(x,y);
        System.out.println(ans);
    }
}
