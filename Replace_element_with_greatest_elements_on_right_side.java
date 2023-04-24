package com.company;

import java.util.Scanner;

public class Replace_element_with_greatest_elements_on_right_side {
    public static int[] replaceElements(int[] arr){
        int length=arr.length;
        int max=replaceElementsHelper(arr,1);
        for(int i=0;i<length;i++){
            if(max==arr[i]){
                max=replaceElementsHelper(arr,i+1);
            }
            arr[i]=max;
        }
        return arr;
    }
    public static int replaceElementsHelper(int[] arr,int index){
        if(index>=arr.length){
            return -1;
        }
        else{
            int max=Integer.MIN_VALUE;
            for(int i=index;i<arr.length;i++){
                max=Math.max(max,arr[i]);
            }
            return max;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int[] ans=replaceElements(arr);
        for(int elem : ans){
            System.out.print(elem+" ");
        }
    }
}
