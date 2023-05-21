package com.company;

import java.util.Scanner;

public class Water_bottle {
    public static int numWaterBottles(int numBottle,int numExchange){
        int ans=0;
        int numDrink=numBottle;
        while(numBottle>0 && numDrink>0){
            ans=ans+numDrink;
            int numEmpty=numBottle%numExchange;
            numDrink=numBottle/numExchange;
            numBottle=numDrink+numEmpty;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numBottle= sc.nextInt();
        int numExchange=sc.nextInt();
        int ans=numWaterBottles(numBottle,numExchange);
        System.out.println(ans);
    }
}
