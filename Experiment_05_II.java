package com.company;

class Print_Message{
    synchronized void print(String message){
        System.out.print("["+message);
        try{
            for(int i=0;i<5;i++){
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("]");
    }
}

public class Experiment_05_II implements Runnable{
    Print_Message p1;
    String message;
    Thread t1;
    public Experiment_05_II(Print_Message p,String message){
        this.p1=p;
        this.message=message;
        t1=new Thread(this);
        t1.start();
    }
    public void run(){
        p1.print(message);
    }
    public static void main(String[] args) {
        Print_Message p=new Print_Message();
        Experiment_05_II e1=new Experiment_05_II(p,"Welcome");
        Experiment_05_II e2=new Experiment_05_II(p,"To");
        Experiment_05_II e3=new Experiment_05_II(p,"Thread Programming");
    }
}
