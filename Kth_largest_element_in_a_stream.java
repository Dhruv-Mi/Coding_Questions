package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class KthLargest{
    int k;
    ArrayList<Integer> nums;

    public KthLargest(int k,int[] nums){
        this.k=k;
        this.nums=new ArrayList<>();
        for(int i=0;i< nums.length;i++){
            this.nums.add(nums[i]);
        }
    }

    public int add(int val){
        nums.add(val);
        Collections.sort(nums);
        return nums.remove(k-1);
    }
}

public class Kth_largest_element_in_a_stream {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        KthLargest obj=new KthLargest(k,nums);
        int p_1=obj.add(3);
        int p_2= obj.add(5);
        int p_3= obj.add(10);
        int p_4= obj.add(9);
        int p_5= obj.add(4);
        System.out.println(p_1+" "+p_2+" "+p_3+" "+p_4+" "+p_5);
    }
}
