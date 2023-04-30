package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Sort_integer_by_the_number_of_1_bits {
    public static int[] sortByBits(int[] arr){
        int length=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int k : arr) {
            String s = Integer.toBinaryString(k);
            int value_1 = calculateBits(s);
            map.put(k, value_1);
        }
        for(int i=0;i<length;i++){
            for(int j=0;j<length-i-1;j++){
                int num_1_bits=map.get(arr[j]);
                int num_2_bits=map.get(arr[j+1]);
                if(num_1_bits>num_2_bits){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                else if(num_1_bits==num_2_bits && arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static int calculateBits(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='1'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int[] ans=sortByBits(arr);
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
}
