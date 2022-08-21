package com.company;

import java.util.Scanner;

public class Happy_Number {
    public static boolean isHappy(int n){
            if (n <= 0 || n==4 || n==2) {
                return false;
            }
            if (n == 1) {
                return true;
            }
            int sum = 0;
            while (n != 0) {
                int temp = n % 10;
                sum += temp * temp;
                n = n / 10;
            }
            return isHappy(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
            boolean ans=isHappy(n);
            System.out.println(ans);
    }
}
