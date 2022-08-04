package com.company;

import java.util.Scanner;

public class minimum_count_of_squares {
    public static int minCount(int n){
        if(n<=0){
            return 0;
        }
        int count=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            int temp=minCount(n-(i*i));
            count=Math.min(count,temp);
        }
        return count+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int ans=minCount(n);
        System.out.println(ans);
    }
}
