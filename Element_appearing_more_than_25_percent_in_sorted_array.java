package com.company;

import java.util.Scanner;

public class Element_appearing_more_than_25_percent_in_sorted_array {
    public static int findSpecialInteger(int[] arr){
        int element=arr[0];
        int count=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(element==arr[i]){
                count++;
            }
            else{
                float percent=(float)(count*100)/arr.length;
                if(percent>25){
                    ans=element;
                }
                element=arr[i];
                count=0;
                i--;
            }
        }
        int percent=(count*100)/arr.length;
        if(percent>25){
            ans=element;
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
        int ans=findSpecialInteger(arr);
        System.out.println(ans);
    }
}
