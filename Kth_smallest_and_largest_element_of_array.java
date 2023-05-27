package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Kth_smallest_and_largest_element_of_array {
    public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr,int n,int k){
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<n;i++){
            int num=arr.get(i);
            if(!temp.contains(num)){
                temp.add(num);
            }
        }
        Collections.sort(temp);
        ArrayList<Integer> ans=new ArrayList<>();
        int smallest=temp.get(k-1);
        int largest=temp.get(temp.size()-k);
        ans.add(smallest);
        ans.add(largest);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            arr.add(temp);
        }
        int k= sc.nextInt();
        ArrayList<Integer> ans=kthSmallLarge(arr,n,k);
        for (Integer an : ans) {
            System.out.print(an + " ");
        }
    }
}
