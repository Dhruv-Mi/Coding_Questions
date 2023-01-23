package com.company;
import java.util.*;

class PC{
    LinkedList<Integer> list=new LinkedList<>();
    int capacity=2;
    public void produce() throws InterruptedException{
        int value=0;
        while(true){
            synchronized(this){
                while(list.size()==capacity){
                    wait();
                }
                System.out.println("Producer: "+value);
                list.add(value++);
                notify();
                Thread.sleep(1000);
            }
        }
    }
    public void consume() throws InterruptedException{
        while(true){
            synchronized(this){
                while(list.size()==0){
                    wait();
                }
                System.out.println("Consume: "+list.removeFirst());
                notify();
                Thread.sleep(1000);
            }
        }
    }
}

public class Experiment_5c {
    public static void main(String[] args) throws InterruptedException {
        final PC pc=new PC();
        Thread t1=new Thread(new Runnable(){
            public void run(){
                try{
                    pc.produce();
                }
                catch (InterruptedException e){
                    System.out.println(e);
                }
            }
        });
        Thread t2=new Thread(new Runnable(){
            @Override
            public void run() {
                try{
                    pc.consume();
                }
                catch (InterruptedException e){
                    System.out.println(e);
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
