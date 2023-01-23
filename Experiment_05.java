package com.company;

public class Experiment_05 implements Runnable{
    public void run(){
        System.out.println("Thread is running...");
    }
    public static void main(String[] args) {
        Runnable r1=new Experiment_05();
        Thread t1=new Thread(r1,"hello");
        t1.start();
        String st=t1.getName();
        System.out.println(st);
    }
}
