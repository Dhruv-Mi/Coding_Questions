package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_an_array_in_groups_of_given_size {
    public static void reverseInGroups(ArrayList<Integer> arr,int k){
        int[] temp=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            temp[i]=arr.get(i);
        }
        for(int i=0;i<arr.size();i+=k) {
            int left=i;
            int right=Math.min(arr.size()-1, i+k-1);
            while(left<right){
                int t=temp[left];
                temp[left]=temp[right];
                temp[right]=t;
                left++;
                right--;
            }
        }
        for(int i=0;i<arr.size();i++){
            arr.remove(i);
            arr.add(i,temp[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int temp= sc.nextInt();
            arr.add(temp);
        }
        int k= sc.nextInt();
        reverseInGroups(arr,k);
        for(int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
