package com.company;

import java.util.Scanner;

public class Distribute_candies_to_people {
    public static int[] distributeCandies(int candies,int num_people){
        int[] ans=new int[num_people];
        int i=0;
        int count=1;
        while(count<=candies){
            ans[i]=ans[i]+count;
            candies=candies-count;
            count++;
            if(i==ans.length-1){
                i=-1;
            }
            i++;
        }
        ans[i]=ans[i]+candies;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int candies=sc.nextInt();
        int num_people= sc.nextInt();
        int[] ans=distributeCandies(candies,num_people);
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
}
