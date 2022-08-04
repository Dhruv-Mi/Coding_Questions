package com.company;

import java.util.Scanner;

public class Best_time_to_buy_and_sell_stock {
    public static int maxProfit(int[] prices){
        int min=Integer.MAX_VALUE;
        int minIndex=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i< prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
                minIndex=i;
            }
        }
        if(minIndex== prices.length-1){
            return 0;
        }
        else{
            for(int i=minIndex+1;i<prices.length;i++){
                if(max<prices[i]){
                    max=prices[i];
                }
            }
        }
        return max-min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] input=new int[n];
        for(int i=0;i<n;i++){
            input[i]= sc.nextInt();
        }
        int ans=maxProfit(input);
        System.out.println(ans);
    }
}
