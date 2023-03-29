package com.company;

import java.util.Scanner;

public class Valid_mountain_array {
    public static boolean validMountainArray(int[] arr){
        int length= arr.length;
        if(length>1){
            if(arr[1]<=arr[0]){
                return false;
            }
            else{
                int count=0;
                for(int i=1;i<length;i++){
                    if(arr[i]==arr[i-1]){
                        return false;
                    }
                    else if(arr[i]>arr[i-1]){
                        if(count==1){
                            return false;
                        }
                    }
                    else{
                        count=1;
                    }
                }
                return count==1;
            }
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        boolean ans=validMountainArray(arr);
        System.out.println(ans);
    }
}
