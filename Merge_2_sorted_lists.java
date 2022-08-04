package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Merge_2_sorted_lists {
    public static LinkedList<Integer> mergeTwoLists(LinkedList<Integer> list1,LinkedList<Integer> list2){
        LinkedList<Integer> ans=new LinkedList<>();
        while(!list1.isEmpty()&&!list2.isEmpty()){
            if(list1.peek()<list2.peek()){
                ans.add(list1.peek());
                list1.remove();
            }
            else{
                ans.add(list2.peek());
                list2.remove();
            }
        }
        while(!list2.isEmpty()){
            ans.add(list2.peek());
            list2.remove();
        }
        while (!list1.isEmpty()){
            ans.add(list1.peek());
            list1.remove();
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list1=new LinkedList<>();
        LinkedList<Integer> list2=new LinkedList<>();
        int n1= sc.nextInt();
        for(int i=0;i<n1;i++){
            int temp= sc.nextInt();
            list1.add(temp);
        }
        int n2= sc.nextInt();
        for(int i=0;i<n2;i++){
            int temp= sc.nextInt();
            list2.add(temp);
        }
        LinkedList<Integer> ans=mergeTwoLists(list1,list2);
        for (Integer an : ans) {
            System.out.print(an+" ");
        }
    }
}
