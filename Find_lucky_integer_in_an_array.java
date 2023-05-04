package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Find_lucky_integer_in_an_array {
    public static int findLucky(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        int count=1;
        int ans=-1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                if(count==arr[i-1] && ans<arr[i-1]){
                    ans=arr[i-1];
                }
                count=1;
            }
            else{
                count++;
            }
        }
        if(count==arr[n-1] && ans<arr[n-1]){
            ans=arr[n-1];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int ans=findLucky(arr);
        System.out.println(ans);
    }
}
