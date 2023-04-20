package com.company;

import java.util.Scanner;

public class Subtract_the_product_and_the_sum_of_digits_of_an_integer {
    public static int subtractProductAndSum(int n){
        int product=1;
        int sum=0;
        while(n!=0){
            int temp=n%10;
            n=n/10;
            product=product*temp;
            sum=sum+temp;
        }
        return product-sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int ans=subtractProductAndSum(n);
        System.out.println(ans);
    }
}
