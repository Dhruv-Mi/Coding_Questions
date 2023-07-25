package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Peak_index_in_a_mountain_array {
    public static int peakIndexInMountainArray(int[] arr){
//        APPROACH-1
//        int[] temp= Arrays.copyOf(arr,arr.length);
//        Arrays.sort(temp);
//        int max=temp[temp.length-1];
//        int index=-1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==max){
//                index=i;
//                break;
//            }
//        }
//        return index;

//        APPROACH-2
//        int max=Integer.MIN_VALUE;
//        int index=-1;
//        for(int i=0;i<arr.length;i++){
//            if(max<arr[i]){
//                max=arr[i];
//                index=i;
//            }
//        }
//        return index;

//        APPROACH-3
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<end){
            int middle=(start+end)/2;
            if(arr[middle]>arr[middle+1] && arr[middle]>arr[middle-1]){
                ans=middle;
                break;
            }
            else if(arr[middle]>arr[middle+1] && arr[middle]<arr[middle-1]){
                end=middle-1;
            }
            else if(arr[middle]>arr[middle-1] && arr[middle]<arr[middle+1]){
                start=middle+1;
            }
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
        int ans=peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
}
