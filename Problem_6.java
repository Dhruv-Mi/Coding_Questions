package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem_6 {
    public static int largeSmallSum(int[] arr){
        if(arr.length<=3){
            return 0;
        }
        else{
            ArrayList<Integer> arrEven=new ArrayList<>();
            ArrayList<Integer> arrOdd=new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                if(i%2==0){
                    arrEven.add(arr[i]);
                }
                else{
                    arrOdd.add(arr[i]);
                }
            }
            Collections.sort(arrEven);
            Collections.sort(arrOdd);
            return arrEven.get(arrEven.size()-2)+arrOdd.get(1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int ans=largeSmallSum(arr);
        System.out.println(ans);
    }
}
