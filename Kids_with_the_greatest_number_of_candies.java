package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kids_with_the_greatest_number_of_candies {
    public static List<Boolean> kidsWithCandies(int[] candies,int extraCandies){
        int max=Integer.MIN_VALUE;
        for (int candy : candies) {
            if (max <= candy) {
                max = candy;
            }
        }
        List<Boolean> ans=new ArrayList<>();
        for (int candy : candies) {
            int temp = candy + extraCandies;
            if (temp >= max) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] candies=new int[n];
        for(int i=0;i<n;i++){
            candies[i]= sc.nextInt();
        }
        int extraCandies= sc.nextInt();
        List<Boolean> ans=kidsWithCandies(candies,extraCandies);
        for (Boolean an : ans) {
            System.out.print(an + " ");
        }
    }
}
