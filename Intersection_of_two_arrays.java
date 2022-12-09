package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Intersection_of_two_arrays {
    public static int[] intersection(int[] nums1, int[] nums2){
        ArrayList<Integer> output=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< nums1.length;i++){
            int num=nums1[i];
            for(int j=0;j<nums2.length;j++){
                int temp=nums2[j];
                if(num==temp){
                    if(!map.containsKey(temp)){
                        output.add(temp);
                        map.put(temp,1);
                    }
                }
            }
        }
        int[] output_original=new int[output.size()];
        for(int i=0;i< output_original.length;i++){
            output_original[i]=output.get(i);
        }
        return output_original;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int[] array1=new int[n1];
        int[] array2=new int[n2];
        for(int i=0;i<n1;i++){
            array1[i]= sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            array2[i]= sc.nextInt();
        }
        int[] output=intersection(array1,array2);
        for (int j : output) {
            System.out.print(j + " ");
        }
    }
}
