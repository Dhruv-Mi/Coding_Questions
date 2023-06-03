package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Number_of_student_unable_to_eat_lunch {
    public static int countStudents(int[] student,int[] sandwiches){
        Queue<Integer> queue=new LinkedList<>();
        Stack<Integer> stack=new Stack<>();
        for (int j : student) {
            queue.add(j);
        }
        for(int i= sandwiches.length-1;i>=0;i--){
            stack.push(sandwiches[i]);
        }
        boolean check=true;
        int count=0;
        while(check){
            if(queue.size()==0  || stack.size()==0){
                break;
            }
            int topSandwich=stack.peek();
            int topStudent= queue.poll();
            if(topStudent==topSandwich){
                stack.pop();
                count=0;
            }
            else{
                queue.add(topStudent);
                count++;
            }
            if(count== queue.size()){
                check=false;
            }
        }
        return queue.size();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] student=new int[n];
        int[] sandwiches=new int[n];
        for(int i=0;i<n;i++){
            student[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sandwiches[i]= sc.nextInt();
        }
        int ans=countStudents(student,sandwiches);
        System.out.println(ans);
    }
}
