package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Reverse_the_array {
    public static void reverseArray(int[] arr,int k){
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=k+1;i< arr.length;i++){
            temp.add(arr[i]);
        }
        Collections.sort(temp);
        int j=temp.size()-1;
        for(int i=k+1;i<arr.length;i++){
            arr[i]=temp.get(j);
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k= sc.nextInt();
        reverseArray(arr,k);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
