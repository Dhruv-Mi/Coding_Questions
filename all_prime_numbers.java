package com.company;

import java.util.Scanner;

public class all_prime_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        boolean check=true;
        int prime;
        for (i = 2; i <= n; i++) {
            for (j = 2; j < i; j++) {
                check = true;
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println(i);
            }
        }
    }
}

