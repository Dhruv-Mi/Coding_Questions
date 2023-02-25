package com.company;

import java.util.*;

public class minimum_index_sum_of_two_list {
    public static String[] findRestaurant(String[] list1,String[] list2){
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        List<String> rst = new ArrayList<>();
        int minSum = Integer.MAX_VALUE, sum;
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                sum = i + map.get(list2[i]);
                if (sum < minSum) {
                    rst.clear();
                    rst.add(list2[i]);
                    minSum = sum;
                } else if (sum == minSum) {
                    rst.add(list2[i]);
                }
            }
        }

        return rst.toArray(new String[rst.size()]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        String[] list1=new String[m];
        String[] list2=new String[n];
        for(int i=0;i<m;i++){
            list1[i]= sc.nextLine();
        }
        for(int i=0;i<n;i++){
            list2[i]= sc.nextLine();
        }
        String[] ans=findRestaurant(list1,list2);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
