package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_number_of_moves_to_seat_everyone {
    public static int minMovesToSeat(int[] seats,int[] students){
        Arrays.sort(seats);
        Arrays.sort(students);
        int ans=0;
        for(int i=0;i<seats.length;i++){
            ans=ans+Math.abs(seats[i]-students[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] seats=new int[n];
        int[] students=new int[n];
        for(int i=0;i<n;i++){
            seats[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            students[i]= sc.nextInt();
        }
        int ans=minMovesToSeat(seats,students);
        System.out.println(ans);
    }
}
