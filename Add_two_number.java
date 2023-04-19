package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Add_two_number {
    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1,LinkedList<Integer> l2){
        StringBuilder num1= new StringBuilder();
        StringBuilder num2= new StringBuilder();
        while(!l1.isEmpty()){
            num1.insert(0, l1.pollFirst());
        }
        while(!l2.isEmpty()){
            num2.insert(0, l2.pollFirst());
        }
        int temp=Integer.parseInt(num1.toString())+Integer.parseInt(num2.toString());
        LinkedList<Integer> ans=new LinkedList<>();
        while(temp!=0){
            ans.add(temp%10);
            temp=temp/10;
        }
        if(ans.size()==0){
            ans.add(0);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        LinkedList<Integer> l1=new LinkedList<>();
        for(int i=0;i<m;i++){
            int temp= sc.nextInt();
            l1.add(temp);
        }
        int n= sc.nextInt();
        LinkedList<Integer> l2=new LinkedList<>();
        for(int i=0;i<n;i++){
            int temp= sc.nextInt();
            l2.add(temp);
        }
        LinkedList<Integer> ans=addTwoNumbers(l1,l2);
        while(!ans.isEmpty()){
            System.out.print(ans.pollFirst()+" ");
        }
    }
}
