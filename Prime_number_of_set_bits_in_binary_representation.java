package com.company;

import java.util.Scanner;

public class Prime_number_of_set_bits_in_binary_representation {
    public static int countPrimeSetBits(int left,int right){
        int ans=0;
        for(int i=left;i<=right;i++){
            boolean temp=countPrimeSetBitsHelper(i);
            if(temp){
                ans++;
            }
        }
        return ans;
    }
    public static boolean countPrimeSetBitsHelper(int n){
        String str=Integer.toBinaryString(n);
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='1'){
                count++;
            }
        }
        return isPrime(count);
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int left= sc.nextInt();
        int right= sc.nextInt();
        int ans=countPrimeSetBits(left,right);
        System.out.println(ans);
    }
}
