package com.company;

import java.util.*;

public class Maximum_subsequence_score {
    public static long maxScore(int[] nums1,int[] nums2,int k){
        int n = nums1.length;
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i] = new int[] { nums2[i], nums1[i] };
        }
        Arrays.sort(pairs, (a, b) -> b[0] - a[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a, b) -> a - b);
        long res = 0, totalSum = 0;
        for (int[] pair : pairs) {
            pq.add(pair[1]);
            totalSum += pair[1];
            if (pq.size() > k) {
                totalSum -= pq.poll();
            }
            if (pq.size() == k) {
                res = Math.max(res, totalSum * pair[0]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] num1=new int[n];
        int[] num2=new int[n];
        for(int i=0;i<n;i++){
            num1[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            num2[i]= sc.nextInt();
        }
        int k= sc.nextInt();
        long ans=maxScore(num1,num2,k);
        System.out.println(ans);
    }
}
