package com.company;

import java.util.*;

public class Top_k_frequent_element {
    public static int[] topKFrequent(int[] nums,int k){
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
            for(int j=0;j<keys.length-i-1;j++){
                if(map.get(keys[j])<map.get(keys[j+1])){
                    int temp=keys[j];
                    keys[j]=keys[j+1];
                    keys[j+1]=temp;
                }
            }
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=keys[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k= sc.nextInt();
        int[] ans=topKFrequent(nums,k);
        for(int element : ans){
            System.out.print(element+" ");
        }
    }
}
