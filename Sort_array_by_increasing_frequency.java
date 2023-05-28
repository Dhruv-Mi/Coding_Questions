package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Sort_array_by_increasing_frequency {
    public static int[] frequencySort(int[] nums){
        int n= nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        Integer[] keys=map.keySet().toArray(new Integer[0]);
        for(int i=0;i< keys.length;i++){
            for(int j=0;j< keys.length-1-i;j++){
                int val1= map.get(keys[j]);
                int val2= map.get(keys[j+1]);
                if(val1>val2){
                    int temp=keys[j];
                    keys[j]=keys[j+1];
                    keys[j+1]=temp;
                }
                else if(val1==val2){
                    if(keys[j]<keys[j+1]){
                        int temp=keys[j];
                        keys[j]=keys[j+1];
                        keys[j+1]=temp;
                    }
                }
            }
        }
        int[] ans=new int[n];
        int k=0;
        for (int key : keys) {
            int val = map.get(key);
            for (int j = 0; j < val; j++) {
                ans[k] = key;
                k++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        int[] ans=frequencySort(nums);
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
}
