package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class N_repeated_element_in_size_2N_array {
    public static int repeatedNTimes(int[] nums){
        int length= nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int temp : nums) {
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }
        Integer[] keys=map.keySet().toArray(new Integer[0]);
        for (int key : keys) {
            if (map.get(key) * 2 == length) {
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        int ans=repeatedNTimes(nums);
        System.out.println(ans);
    }
}
