package com.company;

import java.util.Scanner;

public class Sum_of_even_and_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int sum_even=0;
        int sum_odd=0;
        while(num!=0){
            int n=num%10;
            if(n%2==0){
                sum_even=sum_even+n;
            }
            else{
                sum_odd=sum_odd+n;
            }
            num=num/10;
        }
        System.out.println(sum_even+" "+sum_odd);
    }
}
