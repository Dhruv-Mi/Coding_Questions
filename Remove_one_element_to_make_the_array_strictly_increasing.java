package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Remove_one_element_to_make_the_array_strictly_increasing {
    public static boolean canBeIncreasing(int[] nums){
        ArrayList<Integer> arr=new ArrayList<>();
        for (int num : nums) {
            arr.add(num);
        }
        return canBeIncreasingHelper(arr,0);
    }
    public static boolean canBeIncreasingHelper(ArrayList<Integer> arr,int index){
        if(index>=arr.size()){
            return false;
        }
        int value=arr.get(index);
        arr.remove(index);
        boolean check=true;
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>=arr.get(i+1)){
                check=false;
                break;
            }
        }
        if(check){
            return true;
        }
        else{
            arr.add(index,value);
            return canBeIncreasingHelper(arr,index+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        boolean ans=canBeIncreasing(nums);
        System.out.println(ans);
    }
}
