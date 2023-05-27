package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Find_similarities_between_two_arrays {
    public static ArrayList<Integer> findSimilarity(ArrayList<Integer> arr1,ArrayList<Integer> arr2,int n,int m){
        ArrayList<Integer> distinct=new ArrayList<>();
        for(int i=0;i<n;i++){
            int temp= arr1.get(i);
            if(!distinct.contains(temp)){
                distinct.add(temp);
            }
        }
        int common=0;
        for(int i=0;i<m;i++){
            int temp= arr2.get(i);
            if(distinct.contains(temp)){
                common++;
            }
            else{
                distinct.add(temp);
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(common);
        ans.add(distinct.size());
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            arr1.add(temp);
        }
        int m= sc.nextInt();
        ArrayList<Integer> arr2=new ArrayList<>();
        for(int i=0;i<m;i++){
            int temp=sc.nextInt();
            arr2.add(temp);
        }
        ArrayList<Integer> ans=findSimilarity(arr1,arr2,n,m);
        for (Integer an : ans) {
            System.out.print(an + " ");
        }
    }
}
