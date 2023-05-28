package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Duplicate_in_array {
    public static int findDuplicate(ArrayList<Integer> arr){
        ArrayList<Integer> temp=new ArrayList<>();
        for (int val : arr) {
            if (temp.contains(val)) {
                return val;
            } else {
                temp.add(val);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            arr.add(temp);
        }
        int ans=findDuplicate(arr);
        System.out.println(ans);
    }
}
