package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Relative_sort_array {

    public static int[] relativeSortArray(int[] arr1,int[] arr2){
        int m= arr1.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[m];
        for (int j : arr1) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
        int k=0;
        for (int temp : arr2) {
            while (map.get(temp) > 1) {
                ans[k] = temp;
                map.put(temp, map.get(temp) - 1);
                k++;
            }
            ans[k] = temp;
            map.remove(temp);
            k++;
        }
        Integer[] keys=map.keySet().toArray(new Integer[0]);
        Arrays.sort(keys);
        for (Integer key : keys) {
            while (map.get(key) > 1) {
                ans[k] = key;
                map.put(key, map.get(key) - 1);
                k++;
            }
            ans[k] = key;
            map.remove(key);
            k++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]= sc.nextInt();
        }
        int m= sc.nextInt();
        int[] arr2=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]= sc.nextInt();
        }
        int[] ans=relativeSortArray(arr1,arr2);
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
}
