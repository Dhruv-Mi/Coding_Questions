package com.company;

import java.util.Scanner;

public class Number_of_equivalent_domino_pair {
    public static int numEquivDominoPairs(int[][] dominoes){
        int ans=0;
        for(int i=0;i<dominoes.length;i++){
            int a=dominoes[i][0];
            int b=dominoes[i][1];
            for(int j=i+1;j<dominoes.length;j++){
                int c=dominoes[j][0];
                int d=dominoes[j][1];
                if((a==c && b==d)||(a==d&&b==c)){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] dominoes=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                dominoes[i][j]= sc.nextInt();
            }
        }
        int ans=numEquivDominoPairs(dominoes);
        System.out.println(ans);
    }
}
