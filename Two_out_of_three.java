package com.company;

import java.util.*;

public class Two_out_of_three {
    public static ArrayList<Integer> twoOutOfThree(int[] nums1,int[] nums2,int[] nums3){
                int n1 = nums1.length , n2 = nums2.length , n3 = nums3.length;
                HashSet<Integer> set1 = new HashSet<>();
                HashSet<Integer> set2 = new HashSet<>();
                HashSet<Integer> set3 = new HashSet<>();
                HashMap<Integer,Integer> map = new HashMap<>();
                for (int j : nums1) {
                    if (set1.add(j)) {
                        map.put(j, map.getOrDefault(j, 0) + 1);
                    }
                }
                for(int i = 0 ; i < n2 ; i++){
                    if(set2.add(nums2[i])){
                        map.put(nums2[i], map.getOrDefault(nums2[i],0)+1);
                    }
                }
                for(int i = 0 ; i < n3 ; i++){
                    if(set3.add(nums3[i])){
                        map.put(nums3[i], map.getOrDefault(nums3[i],0)+1);
                    }
                }
                List<Integer> ans = new ArrayList<>();
                ArrayList<Integer> list1 = new ArrayList<>(set1);
                ArrayList<Integer> list2 = new ArrayList<>(set2);
                ArrayList<Integer> list3 = new ArrayList<>(set3);
                for (int i = 0; i < list1.size(); i++) {
                    if (map.get(list1.get(i))>1) {
                        ans.add(list1.get(i));
                        map.put(list1.get(i),0);
                    }
                }
                for (int i = 0; i < list2.size(); i++) {
                    if (map.get(list2.get(i))>1) {
                        ans.add(list2.get(i));
                        map.put(list2.get(i),0);
                    }
                }
                for (int i = 0; i < list3.size(); i++) {
                    if (map.get(list3.get(i))>1){
                        ans.add(list3.get(i));
                        map.put(list3.get(i),0);
                    }
                }
                return (ArrayList<Integer>) ans;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int o= sc.nextInt();
        int[] nums1=new int[m];
        int[] nums2=new int[n];
        int[] nums3=new int[o];
        for(int i=0;i<m;i++){
            nums1[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            nums2[i]= sc.nextInt();
        }
        for(int i=0;i<o;i++){
            nums3[i]= sc.nextInt();
        }
        ArrayList<Integer> ans=twoOutOfThree(nums1,nums2,nums3);
        for (Integer an : ans) {
            System.out.print(an + " ");
        }
    }
}
