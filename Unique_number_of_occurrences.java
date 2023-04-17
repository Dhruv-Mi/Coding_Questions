package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Unique_number_of_occurrences {
    public static boolean uniqueOccurrences(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        ArrayList<Integer> value=new ArrayList<>();
        Integer[] keys=map.keySet().toArray(new Integer[0]);
        for (Integer key : keys) {
            if (value.contains(map.get(key))) {
                return false;
            } else {
                value.add(map.get(key));
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        boolean ans=uniqueOccurrences(arr);
        System.out.println(ans);
    }
}
