package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Reducing_dishes {
    public static int maxSatisfaction(int[] satisfaction){
        Arrays.sort(satisfaction);
        return maxSatisfactionHelper(satisfaction,0,satisfaction.length,1);
    }

    public static int maxSatisfactionHelper(int[] satisfaction,int start,int end,int count){
        if(start==end){
            return 0;
        }
        int ans1=maxSatisfactionHelper(satisfaction,start+1,end,count);
        int ans2=(satisfaction[start]*count)+maxSatisfactionHelper(satisfaction,start+1,end,count+1);
        return Math.max(ans1,ans2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] satisfaction=new int[n];
        for(int i=0;i<n;i++){
            satisfaction[i]= sc.nextInt();
        }
        int ans=maxSatisfaction(satisfaction);
        System.out.println(ans);
    }
}
