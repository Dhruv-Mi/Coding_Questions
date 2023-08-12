package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Leaders_in_an_array {
    public static ArrayList<Integer> leadersInAnArray(int[] arr){
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if(result.isEmpty()){
                result.add(arr[i]);
            }
            else{
                if(result.get(result.size()-1)<=arr[i]){
                    result.add(arr[i]);
                }
            }
        }
        int[] ans=new int[result.size()];
        int j=0;
        for(int i= result.size()-1;i>=0;i--){
            ans[j]=result.get(i);
            j++;
        }
        result=new ArrayList<>();
        for (int an : ans) {
            result.add(an);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        ArrayList<Integer> ans=leadersInAnArray(arr);
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
}
