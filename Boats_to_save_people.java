package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Boats_to_save_people {
    public static int numRescueBoats(int[] people,int limit){
        ArrayList<Integer> arr=new ArrayList<>();
        Arrays.sort(people);
        for (int person : people) {
            arr.add(person);
        }
        int count=0;
        for(int i=0;i<arr.size();i++){
            int person_1=arr.get(i);
            int temp=Integer.MIN_VALUE;
            for(int j=i+1;j<arr.size();j++){
                int person_2=arr.get(j);
                int check=person_1+person_2;
                if(check==limit){
                    temp=limit;
                    break;
                }
                else if(check<limit){
                    temp=Math.max(temp,check);
                }
            }
            count++;
            if(arr.contains(person_1)) {
                arr.remove((Integer) person_1);
            }
            if(arr.contains(temp-person_1)) {
                arr.remove((Integer)(temp - person_1));
            }
            i=-1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] people=new int[n];
        for(int i=0;i<n;i++){
            people[i]= sc.nextInt();
        }
        int limit= sc.nextInt();
        int ans=numRescueBoats(people,limit);
        System.out.println(ans);
    }
}
