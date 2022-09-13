package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class MyStack {
    private Queue<Integer> queue;
    public MyStack() {
        queue = new LinkedList<Integer> ();
    }

    public void push(int x) {
        queue.add(x);
        for (int i = 1; i < queue.size(); i++) {
            queue.add(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}


public class implement_stack_using_queue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MyStack st=new MyStack();
        System.out.println(st.empty());
        st.push(1);
        st.push(2);
        System.out.println(st.top());
        System.out.println(st.pop());
    }
}
