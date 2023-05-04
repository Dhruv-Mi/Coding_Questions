package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Create_target_array_in_the_given_order {
    public static int[] createTargetArray(int[] nums,int[] index){
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            int ind=index[i];
            result.add(ind,val);
        }
        int[] ans=new int[result.size()];
        for(int i=0;i< result.size();i++){
            ans[i]= result.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1= sc.nextInt();
        int[] nums=new int[n1];
        for(int i=0;i<n1;i++){
            nums[i]= sc.nextInt();
        }
        int n2= sc.nextInt();
        int[] index=new int[n2];
        for(int i=0;i<n2;i++){
            index[i]= sc.nextInt();
        }
        int[] ans=createTargetArray(nums,index);
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
}
