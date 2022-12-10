package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Intersection_of_two_arrays_2 {
    public static int[] intersect(int[] nums1,int[] nums2){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums1){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i: nums2){
            if(map.containsKey(i)){
                if(map.get(i)>0){
                    list.add(i);
                    map.put(i, map.get(i)-1);
                }
                else{
                    map.remove(i);
                }
            }
        }
        int[] result = new int[list.size()];
        int i =0;
        while(i<list.size()){
            result[i]=list.get(i);
            i++;
        }
        return result;
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
        int[] output=intersect(array1,array2);
        for (int j : output) {
            System.out.print(j + " ");
        }
    }
}
