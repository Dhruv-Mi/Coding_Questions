package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Sum_of_unique_elements {
    public static int sumOfUnique(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for (int num : nums) {
            if (map.containsKey(num)) {
                if (map.get(num) == 1) {
                    ans = ans - num;
                }
                map.put(num, map.get(num) + 1);
            } else {
                ans = ans + num;
                map.put(num, 1);
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
        int ans=sumOfUnique(nums);
        System.out.println(ans);
    }
}
