package com.company;

import java.util.Scanner;

public class Digit_sum_parities {
    public static int getSum(int num){
        int sum=0;
        while (num!=0){
            int a=num%10;
            num=num/10;
            sum=sum+a;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i=0;i<t;i++){
            int n= sc.nextInt();
            boolean check=true;
            int sum=getSum(n);
            int temp=n;
            if(sum%2==0) {
                while (check) {
                    ++temp;
                    int sum2=getSum(temp);
                    if(sum2%2!=0){
                        check=false;
                        System.out.println(temp);
                    }
                }
            }
            else{
                while (check) {
                    ++temp;
                    int sum2=getSum(temp);
                    if(sum2%2==0){
                        check=false;
                        System.out.println(temp);
                    }
                }
            }
        }
    }
}
