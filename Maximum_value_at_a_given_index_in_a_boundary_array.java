package com.company;

import java.util.Scanner;

public class Maximum_value_at_a_given_index_in_a_boundary_array {
    public static int maxValue(int n,int index,int maxSum){
        int start=1;
        int end=maxSum;
        int ans=1;
        while(start<=end){
            int middle=(start+end)/2;
            long tempSum=isPossible(n,index,middle);
            if(tempSum<=maxSum){
                ans=middle;
                start=middle+1;
            }
            else{
                end=middle-1;
            }
        }
        return ans;
    }
    public static long isPossible(int n,int index,int middle){
        long sum=middle;
        int temp=middle;
        for(int i=index-1;i>=0;i--){
            if (temp - 1 > 0) {
                temp = temp - 1;
            }
            sum=sum+temp;
        }
        temp=middle;
        for(int i=index+1;i<n;i++){
            if (temp - 1 > 0) {
                temp = temp - 1;
            }
            sum=sum+temp;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int index= sc.nextInt();
        int maxSum= sc.nextInt();
        int ans=maxValue(n,index,maxSum);
        System.out.println(ans);
    }
}
