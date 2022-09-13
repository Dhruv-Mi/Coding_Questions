package com.company;

import java.util.Stack;

class MyQueue{
    private Stack<Integer> st1;

    public MyQueue(){
        this.st1=new Stack<>();
    }

    public void push(int x){
        st1.push(x);
    }

    public int pop(){
        Stack<Integer> st2=new Stack<>();
        while(!st1.isEmpty()){
            int temp= st1.pop();
            st2.push(temp);
        }
        st1=st2;
        Stack<Integer> st3=new Stack<>();
        int ans=st1.pop();
        while(!st1.isEmpty()){
            int temp= st1.pop();
            st3.push(temp);
        }
        st1=st3;
        return ans;
    }

    public int peek(){
        Stack<Integer> st2=new Stack<>();
        while(!st1.isEmpty()){
            int temp= st1.pop();
            st2.push(temp);
        }
        st1=st2;
        Stack<Integer> st3=new Stack<>();
        int ans=st1.peek();
        while(!st1.isEmpty()){
            int temp= st1.pop();
            st3.push(temp);
        }
        st1=st3;
        return ans;
    }

    public boolean empty(){
        return st1.isEmpty();
    }
}

public class implement_queue_using_stack {
    public static void main(String[] args) {
        MyQueue queue=new MyQueue();
        System.out.println(queue.empty());
        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.empty());
    }
}
