package com.company;

import java.util.Scanner;

public class Final_prices_with_a_special_discount_in_a_shop {
    public static int[] finalPrices(int[] prices){
        int n= prices.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(prices[i]>=prices[j]){
                    prices[i]=prices[i]-prices[j];
                    break;
                }
            }
        }
        return prices;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] prices=new int[n];
        for(int i=0;i<n;i++){
            prices[i]= sc.nextInt();
        }
        int[] ans=finalPrices(prices);
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
}
