package com.company;

import java.util.Scanner;

public class Count_odd_number_in_an_interval_range {
    public static int countOdds(int low,int high){
        int ans=0;
        if(low==high && low%2==1){
            return 1;
        }
        else if(low==high && low%2==0){
            return 0;
        }
        else if(low%2==1 && high%2==1){
            int temp=high-low-1;
            ans=ans+2+(temp/2);
        }
        else if(low%2==0 && high%2==0){
            ans=ans+(high-low)/2;
        }
        else if(low%2==0 && high%2==1){
            ans=ans+1+(high-low)/2;
        }
        else{
            ans=ans+1+(high-low)/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int low= sc.nextInt();
        int high= sc.nextInt();
        int ans=countOdds(low,high);
        System.out.println(ans);
    }
}
