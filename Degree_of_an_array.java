package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Degree_of_an_array {
    public static int findShortestSubArray(int[] nums){
        int length= nums.length;
        ArrayList<Integer> maximum_degree=new ArrayList<>();
        int degree=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (int num : nums) {
            int value = map.get(num);
            if (degree < value) {
                maximum_degree.clear();
                maximum_degree.add(num);
                degree = value;
            } else if (degree == value) {
                if (!maximum_degree.contains(num)) {
                    maximum_degree.add(num);
                }
            }
        }
        int ans=Integer.MAX_VALUE;
        for (int temp : maximum_degree) {
            int forward = 0;
            int backward = length - 1;
            int count = Integer.MAX_VALUE;
            while (forward <= backward) {
                if (nums[forward] == nums[backward] && nums[forward] == temp && nums[backward] == temp) {
                    count = backward - forward + 1;
                    break;
                }
                if (nums[forward] != temp) {
                    ++forward;
                }
                if (nums[backward] != temp) {
                    --backward;
                }
            }
            ans = Math.min(count, ans);
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
        int ans=findShortestSubArray(nums);
        System.out.println(ans);
    }
}
