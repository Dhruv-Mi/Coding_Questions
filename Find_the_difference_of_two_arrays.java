package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Find_the_difference_of_two_arrays {
    public static List<List<Integer>> findDifference(int[] nums1,int[] nums2){
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp1=new ArrayList<>();
        for (int value : nums1) {
            int check = 0;
            for (int k : nums2) {
                if (value == k) {
                    check = 1;
                    break;
                }
            }
            if (check == 0 && !temp1.contains(value)) {
                temp1.add(value);
            }
        }
        ans.add(temp1);
        List<Integer> temp2=new ArrayList<>();
        for (int value : nums2) {
            int check = 0;
            for (int k : nums1) {
                if (value == k) {
                    check = 1;
                    break;
                }
            }
            if (check == 0 && !temp2.contains(value)) {
                temp2.add(value);
            }
        }
        ans.add(temp2);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1= sc.nextInt();
        int[] nums1=new int[n1];
        for(int i=0;i<n1;i++){
            nums1[i]= sc.nextInt();
        }
        int n2= sc.nextInt();
        int[] nums2=new int[n2];
        for(int i=0;i<n2;i++){
            nums2[i]= sc.nextInt();
        }
        List<List<Integer>> ans=findDifference(nums1,nums2);
        for (List<Integer> an : ans) {
            for (Integer integer : an) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
