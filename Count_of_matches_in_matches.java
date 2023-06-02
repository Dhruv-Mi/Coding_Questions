package com.company;

import java.util.Scanner;

public class Count_of_matches_in_matches {
    public static int numberOfMatches(int n){
        int ans=0;
        while(n>1){
            if(n%2==0){
                ans=ans+(n/2);
                n=n/2;
            }
            else{
                ans=ans+((n-1)/2);
                n=((n-1)/2)+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int ans=numberOfMatches(n);
        System.out.println(ans);
    }
}
