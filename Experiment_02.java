package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Area_square{
    int height;

    public Area_square(int height){
        this.height=height;
    }
}

class Area extends Area_square{
    int length;
    int breadth;

    public Area(int length,int breadth,int height){
        super(height);
        this.length=length;
        this.breadth=breadth;
    }

    public int volume(){
        return length*breadth*height;
    }

    public int area(){
        return length*breadth;
    }
}

public class Experiment_02 {
    public static void main(String[] args) {
//        Stack<Integer> stack=new Stack<>();
//        for(int i=0;i<5;i++){
//            stack.push(i);
//        }
//        for(int i=0;i<5;i++){
//            System.out.println(stack.pop());
//        }
//        for(int i=0;i<5;i++){
//            stack.push(i);
//        }
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        System.out.println(stack.search(3));
//        Queue<Integer> queue=new LinkedList<>();
//        for(int i=0;i<5;i++){
//            queue.add(i);
//        }
//        System.out.println(queue.remove());
//        System.out.println(queue.peek());
//        System.out.println(queue.size());
        Scanner sc=new Scanner(System.in);
        int length= sc.nextInt();
        int breadth= sc.nextInt();
        int height= sc.nextInt();
        Area a1=new Area(length,breadth,height);
        System.out.println(a1.area());
        System.out.println(a1.volume());
    }
}
